//https://www.hackerrank.com/challenges/compare-the-triplets/problem

package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	Integer first = 0;
    	Integer second = 0;
    	List<Integer> result = new ArrayList<Integer>();
    	for(int i = 0; i < 3; i++) {
    		if(a.get(i) > b.get(i)) {
    			first += 1;
    		} else if(a.get(i) < b.get(i)){
    			second += 1;
    		}
    	}
    	result.add(first);
    	result.add(second);
    	return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);
        
        System.out.println(result.get(0) + " " + result.get(1));
        
        bufferedReader.close();
    }
}
