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
        myPet.setAnimalTypeKingdom("deer", "animalia");

        System.out.println(myPet.getAnimalType() + " is an " + myPet.getAnimalKingdom());
    }
}

class Animal {
        private String animalType;
        private String animalKingdom;

        public Animal(String animalType)
        {
            this.animalType = animalType;;
        }

        public void setAnimalTypeKingdom(String type, String kingdom)
        {
            this.setAnimalType(type);
            this.setAnimalKingdom(kingdom);
        }

        public void setAnimalKingdom(String kingdom)
        {
            this.animalKingdom = kingdom;
        }

        public void setAnimalType(String animalType)
        {
            this.animalType = animalType;
        }

        public String getAnimalType() {
            return animalType;
        }

        public String getAnimalKingdom() {
            return animalKingdom;
        }
}
  
