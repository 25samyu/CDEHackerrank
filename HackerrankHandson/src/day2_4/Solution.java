package day2_4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<String> resSet = new HashSet<String>();

       /* int[] sArr = new int[n];
        for(int i=0;i<n;i++){
            set.add(ar[i]);
        }
        Iterator<Integer> it = set.iterator();
        int i=0;
        while(it.hasNext()){
            sArr[i] = it.next();
            i++;
        }*/
        int count=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i<j){

               if((ar[i]+ar[j])%k==0){
                   count++;
               }
               }
           }
       }
       return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
