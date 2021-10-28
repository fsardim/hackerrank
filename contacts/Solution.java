package contacts;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		Scanner in = new Scanner(System.in);
		
        int queriesRows = Integer.parseInt(in.nextLine());

        List<List<String>> queries = new ArrayList<>();

        for (int i = 0; i < queriesRows; i++) {
            queries.add(Arrays.asList(in.nextLine()));
        }

        List<Integer> result = Result.contacts(queries);

        for (int i = 0; i < result.size(); i++) {
        		
        	System.out.println(result.get(i));
        		
        }
        
        in.close();
    }
}
