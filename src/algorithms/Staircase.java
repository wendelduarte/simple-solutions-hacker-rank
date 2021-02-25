package algorithms;

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	for(int i = n; i >= 1; i--) {
    		for(int k = i; k > 1; k--) {
    			System.out.print(" ");
    		}
    		for(int j = i; j<=n; j++) {
    			System.out.print("#");
    		}
    		System.out.println();
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
