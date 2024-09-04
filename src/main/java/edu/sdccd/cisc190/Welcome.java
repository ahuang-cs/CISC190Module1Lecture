package edu.sdccd.cisc190;

/*
this
is
a
multiline
comment
*/

// this is a comment line

/**
 * This is the Welcome class!
 */
public class Welcome {

    static String hello = "hello!";
    static
    {
        hello = "hello world!";
        int bar = 5/0;
    }

    public static void main(String[] arguments) {
        User.getClassName();
        User user1 = new User();
        user1.sendEmail("hello", "world");

        System.out.println(hello);

        for(int i = 0; i < arguments.length; i++) {
            System.out.println(i + ": " + arguments[i]);
        }
        System.out.println(getAreaOfCircle(5));
    }

    /**
     * This method returns the area of a circle given the radius
     * @param radius the radius of the circle
     * @return a double representing the area of a circle
     */
    public static double getAreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }
}
