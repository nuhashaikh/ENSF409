import java.util.Arrays;

public class SimpleArrays {

    public static void main(String[] args) {

        // Create an array of integers containing the values shown
        int[] implicitLengthArray = {1, 2, 3, 5};
        System.out.println("implicitLengthArray: ");
        // Iterate through the array and output the value. 
        for (int tmpValue : implicitLengthArray) {
          System.out.println(tmpValue);
        }

	    // Create an array of integers with a length of three
        int[] explicitLengthArray = new int[3];
        // Iterate over the array: show original values; set new ones
        System.out.println("explicitLengthArray: ");
        for (int i=0; i < explicitLengthArray.length; i++) {
            System.out.println(explicitLengthArray[i]);
            explicitLengthArray[i] = 10*i;
            System.out.println(explicitLengthArray[i]);
        }

        // Copy an array (by reference)
        System.out.println("First value of explicitLengthArray: ");
        int[] copyArray = explicitLengthArray;
        copyArray[0] = 80000;
        System.out.println(explicitLengthArray[0]);

        // Copy an array by value, first 2 elements
        // copyOf is provided by java.util.Arrays
        int[] valueCopyArray = Arrays.copyOf(explicitLengthArray, 2);
        System.out.println("valueCopyArray: ");
        valueCopyArray[1] = 93;
        // The value has been changed for the copy
        for (int tmpValue : valueCopyArray) {
            System.out.println(tmpValue);
        }
        // The original array retains the original value
        System.out.println(explicitLengthArray[1]);
    }
    
}
  
