/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a> 
@version    1.7
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
        myPet.setAnimalType("mouse");
        Animal myWildlife = new Animal();
        myWildlife.setAnimalType("deer");

        System.out.print("I have a pet " + myPet.getAnimalType());
        System.out.println(" belonging to kingdom " + myPet.getKingdom());
        System.out.print("I see a member of kingdom " + myWildlife.getKingdom());
        System.out.println(", namely a " + myWildlife.getAnimalType() + ", outside");
    }
}

class Animal {
        private String animalType;
        private static String kingdom = "animalia";

        public void setAnimalType(String arg) {
            animalType = arg;
        }
       
        public String getAnimalType() {
            return animalType;
        }

        public static String getKingdom() {
            return kingdom;
        }
}
