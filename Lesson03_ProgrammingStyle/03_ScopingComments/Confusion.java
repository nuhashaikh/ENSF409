public class Confusion
{
    static int one = 11;  // Class scope
    private int two = 33; // Class scope
    public void methodOne(int one) //Parameter
    {
        Confusion test = new Confusion();
        this.one = 22; // Object scope
        two = 44; // Method scope
 
        System.out.println("Confusion.one: " + Confusion.one); // Object scope
        System.out.println("test.one: " + test.one); // Object scope
        System.out.println("test.two: " + test.two); // Class scope
        System.out.println("two: " + two); // Method scope
    }
 
    public static void main(String args[])
    {
        Confusion test = new Confusion();
        test.methodOne(5);
    }
}

