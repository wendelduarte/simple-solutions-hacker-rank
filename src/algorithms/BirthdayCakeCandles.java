package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);
        
        System.out.println(result);
        bufferedReader.close();
    }
    
    static class Result {

        /*
         * Complete the 'birthdayCakeCandles' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY candles as parameter.
         */

        public static int birthdayCakeCandles(List<Integer> candles) {
            Integer max = candles.stream().max(Comparator.comparing(m -> m)).get();
            Integer count = 0;
            
            for(Integer candle : candles) {
                if(candle.equals(max)) {
                    count++;
                }
            }
            
            return count;
        }
    }
}
