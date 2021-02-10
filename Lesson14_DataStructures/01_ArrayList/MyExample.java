import java.util.*;

public class MyExample {
    public static void main(String args[]) {
        // Create an ArrayList
        ArrayList<String> myCake = new ArrayList <>();
        myCake.add("Chocolate");
        myCake.add("Vanilla");
        myCake.add("Lemon");
        System.out.println("Cakes are: " + myCake);


        // Add an element to the end of ArrayList
        myCake.add("Strawberry");

        // Traverse a ArrayList
        Iterator<String> iter = myCake.iterator();
        System.out.println("Cakes are: ");
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Access a specific element by index
        String elem = myCake.get(1);
        System.out.println("Second cake element is: " + elem);
        System.out.println("I have this many cakes: " + myCake.size());

        //Empty ArrayList, check if ArrayList is empty
        myCake.clear();
        if(myCake.isEmpty()) {
            System.out.println("All cakes were eaten.");
        }

        // Convert to Array
        myCake.add("Carrot");
        myCake.add("Sponge");
        System.out.println("I got more cakes: ");
        Object[] cakes = myCake.toArray();
        for(int i=0; i < cakes.length; i++) {
            System.out.println(cakes[i]);
        }
    }
}