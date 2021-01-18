public class JavaStrings {

    public static void main(String[] args) {
        
        String animalFact1 = "Horses are mammals.";
        String animalFact2 = new String("Elephants are mammals.");
        String animalFact3 = new String (animalFact1);
		        
        System.out.println(animalFact1.length());  // Length = 19
        System.out.println(animalFact2.length());  // Length = 22
        System.out.println(animalFact3.length());  // Length = 19		
    }
}
