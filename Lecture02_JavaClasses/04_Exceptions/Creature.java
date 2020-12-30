/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.3
@since      1.0
*/

/* 
Creature defines the structure of an animal.
*/

public class Creature {
    /**
    @param args Handles a single command-line argument
    */
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("You must supply a command-line argument");
        } else {
            System.out.println("This is a placeholder for Creature " + args[0]);
        }
    }
}
