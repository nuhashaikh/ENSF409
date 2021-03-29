package edu.ucalgary.ensf409;

import java.sql.*;

public class Registration{

    public final String DBURL; //store the database url information
    public final String USERNAME; //store the user's account username
    public final String PASSWORD; //store the user's account password
    
    
	// Some example test data is shown here.  This is not a full list of all possible tests (i.e. competitors under the age of 5, over 18, etc.)
	// Tests will be done on a database with the same table names/attributes, but different data records.
	
    public static void main(String[] args) {

        Registration myJDBC = new Registration("jdbc:mysql://localhost/competition","Marasco","ensf409");
        myJDBC.initializeConnection();
        
        System.out.println(myJDBC.selectAllNames("competitor"));
        /*
        Example:
        Williams, Sophie
        Warren, Harper
        */
                
        System.out.println(myJDBC.selectAllNames("teacher"));
        /*
        Example:
        Estrada, Ethan
        Lee, Jasmine
        */

        System.out.println(myJDBC.showStudios());
        /*
        Example:
        Harmony Inc.
        Melody Time
        Music Mastery
        */
        
        myJDBC.insertNewCompetitor("123", "Smyth", "Ali", 15, "Oboe", "0023");
        myJDBC.registerNewTeacher("0987", "Marasco", "Emily", "403-222-5656", "Marasco Music", "587-222-5656", "123 Main Street NW");        

        myJDBC.deleteCompetitor("123");
        myJDBC.deleteTeacher("0987");
        
    }
}

