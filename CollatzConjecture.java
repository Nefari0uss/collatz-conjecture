import java.util.Scanner;

/**
 * Program Collatz Conjecture
 * @author Nefari0uss
 * This program will do the Collatz Conjecture. It takes a integer input and finds the number of steps to reach one
 * using the following algorithm:
 *   If n is even, divide it by 2.
 *   If n is odd, multiply it by 3 and add 1.
 * @date 4 Jan 2014
 */

public class CollatzConjecture {

    public static void main(String[] args) {

        int n = getInput();

        collatz(n);

    } // end main

	private static int getInput() {

		int n;
		Scanner input = new Scanner(System.in);
        System.out.println("Generate series for what *positive* integer?");
        String num = input.nextLine();
        
        // Handle input greater than Java's MAX_INT.
        try {
            n = Integer.parseInt(num);
        }
        catch (NumberFormatException e) {
            System.out.println("n is too lage. Setting n to be the largest possible int value.");
            n = Integer.MAX_VALUE;
            //System.out.println(n);
        }
        input.close();
        return n;
	}

    public static void collatz(int n) {
        int count = 0;

        System.out.println("\nThe Hailstone Sequence for " + n + " is:");
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                printN(n);
                count++;
            } else /* n is odd */ {
                n = 3 * n + 1;
                printN(n);
                count++;
            }
        }
        System.out.println("\nIt took " + count + " steps for " + n + " to reach 1.");
    }
    
	private static void printN(int n) {
        System.out.print(n + ", ");
	}
}

