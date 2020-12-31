/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.6
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
        Animal myPet = new Animal();
        myPet.setanimalType("mouse");
        Animal myWildlife = new Animal();
        myWildlife.setanimalType("deer");

        System.out.println("I have a pet " + myPet.animalType());
        System.out.println("I see a " + myWildlife.animalType() + " outside");
    }
}

class Animal {
        private String animalType;

        public void setanimalType(String arg) {
            animalType = arg;
        }
       
        public String animalType() {
            return animalType;
        }
}
