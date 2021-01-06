/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.2
@since      1.0
*/

/* 
Creature defines the structure of an animal.
*/

public class Creature {
    /**
    @param args Handles an optional command-line argument
    */
    public static void main(String[] args) {
        System.out.print("This is a placeholder for ");
        for (int i = 0; i < args.length; i++)
		System.out.print(args[i] + " ");
	System.out.println();
    }
}
