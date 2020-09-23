package Array;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.*;

public class kadanesalgo {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder=new StringBuilder();
        while(t-- >0){

            int n=Integer.parseInt(bufferedReader.readLine());
            int[] a =new int[n];
            StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine(), " ");
            for (int i = 0; i <n ; i++) {
                a[i]=Integer.parseInt(stringTokenizer.nextToken());
            }
            int ans=Integer.MIN_VALUE;
            int sum=0;
            for (int value : a) {
                sum += value;
                if (sum > ans) {
                    ans = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }

            }
            stringBuilder.append(ans).append("\n");

        }
        System.out.println(stringBuilder);



    }
}
