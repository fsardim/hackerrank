package unbalancedBrackets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());

    	String[] s = {"{[()]}", "{[(])}", "{{[[(())]]}}", "{{([])}}", "{{)[](}}", "{(([])[])[]}", "{(([])[])[]]}", "{(([])[])[]}[]"};
    	String resultado = "";
    	
        for (int tItr = 0; tItr < 8; tItr++) {
//            String s = bufferedReader.readLine();

        	
        	resultado += Result.isBalanced(s[tItr]) + ", "; 

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }
        System.out.println(resultado);
        System.out.println("Resultado esperado: YES, NO, YES, YES, NO, YES, NO, YES");

//        bufferedReader.close();
//        bufferedWriter.close();
    }
}