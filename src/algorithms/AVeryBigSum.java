//https://www.hackerrank.com/challenges/a-very-big-sum/problem
	
package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	long result = 0l;
    	for(long item : ar) {
    		result += item;
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        while(arCount < 1 || arCount > 10) {
        	System.out.println("Invalid, try again: ");
        	arCount = scanner.nextInt();
        }
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
        	if(Long.parseLong(arItems[i]) < 0 || Long.parseLong(arItems[i]) > 10000000000l) {
        		return;
        	}
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);
        
        System.out.println(result);

        scanner.close();
    }
}
