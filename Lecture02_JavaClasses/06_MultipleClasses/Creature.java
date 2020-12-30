/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.5
@since      1.0
*/

/* 
Creature defines the structure of an animal.
*/

public class Creature {
    /**
    @param args Ignored command-line argument
    */
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        String myType = myAnimal.animalType();
        System.out.println("This is a placeholder for Creature " + myType);
    }
}

class Animal {
        private String animalType = "dog";
       
        public String animalType() {
            return animalType;
        }
}
