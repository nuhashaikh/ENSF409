import java.util.StringTokenizer;

public class JavaStrings {

    public static void main(String[] args) {
        
        StringTokenizer tokens = new StringTokenizer ("Elephants are mammals.");
        System.out.println("Number of tokens: " + tokens.countTokens());
        while (tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
    }        
}  
