public class JavaStrings {

    public static void main(String[] args) {
      
        String elephantWeight = "6000";
        String babyElephantWeight = "100";

        int sumElephants = Integer.parseInt(elephantWeight) + Integer.parseInt(babyElephantWeight);
	System.out.println("Adult and baby weigh " + sumElephants + " kg.");
        sumElephants = Integer.valueOf(elephantWeight) + Integer.valueOf(babyElephantWeight);
	System.out.println("Adult and baby weigh " + sumElephants + " kg.");
    }
}
