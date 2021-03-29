package edu.ucalgary.ensf409;

import java.sql.*;

public class JDBCDemo{

    private Connection dbConnect;
    private ResultSet results;
            
    public JDBCDemo(){
    }
    
    public void createConnection(){
                
        try{
            dbConnect = DriverManager.getConnection("jdbc:mysql://localhost/pets", "Marasco", "ensf409");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String selectCats(){

        StringBuffer catsAndOwners = new StringBuffer();
        
        try {                    
            Statement myStmt = dbConnect.createStatement();
            results = myStmt.executeQuery("SELECT * FROM cats");
            
            while (results.next()){
                System.out.println("Print results: " + results.getString("name") + ", " + results.getString("owner"));
                
                catsAndOwners.append(results.getString("name") + ", " + results.getString("owner"));
                catsAndOwners.append('\n');
            }
            
            myStmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return catsAndOwners.toString();

    }    
    
    public void insertNewCat(int id, String name, String owner, String birthdate){

        try {
            
            String query = "INSERT INTO cats (id, name, owner, birth) VALUES (?,?,?,?)";
            PreparedStatement myStmt = dbConnect.prepareStatement(query);
            
            myStmt.setInt(1, id);
            myStmt.setString(2, name);
            myStmt.setString(3, owner);
            myStmt.setString(4, birthdate);
            
            int rowCount = myStmt.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
            
            myStmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    

    public void deleteCat(String name){
                    
        try {
            String query = "DELETE FROM cats WHERE name = ?";
            PreparedStatement myStmt = dbConnect.prepareStatement(query);

            myStmt.setString(1, name);
                        
            int rowCount = myStmt.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
            
            myStmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }    

    public void close() {
        try {
            results.close();
            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {

        JDBCDemo myJDBC = new JDBCDemo();
 
        myJDBC.createConnection();
        
        String allCats = myJDBC.selectCats();
        System.out.println("Here is a list of cats and owners: ");
        System.out.println(allCats);
        
        myJDBC.insertNewCat(123,"Cookie","Casey","2013-11-13");   
        myJDBC.insertNewCat(10,"Cookie","Casey","2013-11-13");
        myJDBC.selectCats();        
        myJDBC.deleteCat("Cookie");
        myJDBC.selectCats();
        
        myJDBC.close();        
    }
}
