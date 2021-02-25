package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Long minSum = 0L;
    	Long maxSum = 0L;
    	Arrays.sort(arr);
    	
    	for(int i = 0; i < arr.length -1; i++) {
    		minSum += arr[i];
    	}
    	
    	for(int i = 1; i < arr.length; i++) {
    		maxSum += arr[i];
    	}
    	
    	System.out.print(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
