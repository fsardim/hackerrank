package runningMedian;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int aCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());

    	List<Integer> a = new ArrayList<>();
    	a.add(12);
    	a.add(4);
    	a.add(5);
    	a.add(3);
    	a.add(8);
    	a.add(7);
    	
    	List<Double> result = Result.runningMedian(a);
    	for(int i = 0; i<result.size(); i++) {
    		System.out.println(result.get(i));
    	}

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}