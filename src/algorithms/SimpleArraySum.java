package algorithms;

import java.io.IOException;
//https://www.hackerrank.com/challenges/simple-array-sum/problem

import java.util.Scanner;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
    	for(int value : ar) {
        	sum += value;
        }
    	return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);
        
        System.out.println(result);
    }
}
