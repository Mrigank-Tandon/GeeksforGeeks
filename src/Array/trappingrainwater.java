package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class trappingrainwater {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t-- > 0) {

            int n = Integer.parseInt(bufferedReader.readLine());
            int[] a = new int[n];
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            int []left=new int[n];
            left[0]=a[0];
            for (int i = 1; i <n ; i++) {
                left[i]=Math.max(left[i-1],a[i]);
            }
            int []right=new int[n];
            right[n-1]=a[n-1];
            for (int i = n-2; i >=0 ; i--) {
                right[i]=Math.max(right[i+1],a[i]);
            }
            int count=0;
            for (int i = 0; i <n ; i++) {
                count+=(Math.min(left[i],right[i])-a[i]);
            }
            stringBuilder.append(count).append("\n");


        }
        System.out.println(stringBuilder);
    }
}
