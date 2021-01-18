import java.util.regex.*;

public class JavaStrings {

    public static void main(String[] args) {
        
        Pattern myPattern = Pattern.compile("Horses", Pattern.CASE_INSENSITIVE);
        Matcher myMatcher = myPattern.matcher("Horses are mammals. Seahorses are not.");
        int matchCount = 0;
        while (myMatcher.find())
            matchCount++;
        System.out.println(matchCount);
	}
}
		