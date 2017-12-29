/**
 * Examples from Chapter 4.
 */
public class Conditional {

    public static void main(String[] args) {
        int x = 17;
        int n = 18;

        if (x > 0) {
            System.out.println("x is positive");
        }

        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else {
            if (x < 0) {
                System.out.println("x is negative");
            } else {
                System.out.println("x is zero");
            }
        }

        boolean evenFlag = (n % 2 == 0);    // true if n is even
        boolean positiveFlag = (x > 0);     // true if x is positive

        if (evenFlag) {
            System.out.println("n was even when I checked it");
        }

        if (!evenFlag) {
            System.out.println("n was odd when I checked it");
        }
    }

}