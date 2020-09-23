package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class kthsmallest {
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
            Arrays.sort(a);
            stringBuilder.append(a[Integer.parseInt(bufferedReader.readLine())-1]).append("\n");



        }
        System.out.println(stringBuilder);
    }
}
