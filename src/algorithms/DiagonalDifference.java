//https://www.hackerrank.com/challenges/diagonal-difference/problem

package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int leftToRight = 0;
    	int rightToLeft = 0;
    	
    	for(int row = 0; row < arr.size(); row++) {
    		for(int column = 0; column < arr.size(); column++) {
    			if(row == column) {
    				leftToRight += arr.get(row).get(column);
    			}
    			if(row + column == arr.size()-1) {
    				rightToLeft += arr.get(row).get(column);
    			}
    		}
    	}
    	return Math.abs(leftToRight - rightToLeft);
    }

}

public class DiagonalDifference {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
    }
}