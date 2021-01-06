/*
From this exercise on, documentation will not be included in examples.
Adding documentation is the responsibility of the student.
Please refer to earlier examples for documentation.
*/

public class Confusion
{
    static int one = 11;
    private int two = 33;
    public void methodOne(int one)
    {
        Confusion test = new Confusion();
        this.one = 22;
        two = 44;
 
        System.out.println("Confusion.one: " + Confusion.one);
        System.out.println("test.one: " + test.one);
        System.out.println("test.two: " + test.two);
        System.out.println("two: " + two);
    }
 
    public static void main(String args[])
    {
        Confusion test = new Confusion();
        test.methodOne(5);
    }
}

