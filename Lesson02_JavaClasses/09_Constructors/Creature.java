/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.8
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
        Animal myPet = new Animal("mouse");
        Animal myWildlife = new Animal("deer");

        System.out.println("I have a pet " + myPet.getAnimalType());
        System.out.println("I see a " + myWildlife.getAnimalType() + " outside");
    }
}

class Animal {
        private String animalType;

        public Animal(String givenType) {
            animalType = givenType;
	}

        public void setAnimalType(String arg) {
            animalType = arg;
        }
       
        public String getAnimalType() {
            return animalType;
        }
}
