/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a>
@version    1.7
@since      1.0
*/

/*
Hello is a simple example program for lecture 01
*/

public class Hello {
    /**
    This prints "Hello" and the contents of a variable.
    @param args Optional command-line argument
    */
    public static void main(String[] args) {
        short ExampleShort = 2;
	long ExampleLong = 100100;
	float ExampleFloat = 1;
        double ExampleDouble = 2.03;
        System.out.println("Hello " + ExampleShort + ", " + ExampleLong);
        System.out.println(ExampleFloat + ", " + ExampleDouble);
    }
} // End of class declaration
