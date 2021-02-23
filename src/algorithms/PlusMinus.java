package algorithms;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below
    static void plusMinus(int[] arr) {
    	int numberOfPositives = 0;
    	int numberOfNegatives = 0;
    	int numberOfZeros = 0;
    	
    	for(int currentValue : arr) {
    		if(currentValue > 0) {
    			numberOfPositives++;
    		} else if (currentValue < 0) {
    			numberOfNegatives++;
    		} else {
    			numberOfZeros++;
    		}
    	}
    	
    	double positive = (double) numberOfPositives/arr.length;
    	double negative = (double) numberOfNegatives/arr.length;
    	double zero = (double) numberOfZeros/arr.length;
    	
    	System.out.printf("%.6f\n", positive);
    	System.out.printf("%.6f\n", negative);
    	System.out.printf("%.6f\n", zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
