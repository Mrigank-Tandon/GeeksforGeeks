package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pythagoriantriplet {
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
            for (int i = 0; i < n; i++) {
                a[i]=a[i]*a[i];
            }
            Arrays.sort(a);
            int flag=0;
            for (int i = n-1; i >=  2; i--) {
                int l=0;
                int r=i-1;
                while(l<r){
                    if (a[l] + a[r] == a[i]) {
                        flag = 1;
                        break;
                    }
                    if(a[l]+a[r]<a[i])
                        l++;
                    else
                        r--;
                }
            }
            if(flag==1){
                stringBuilder.append("YES").append("\n");
            }
            else
                stringBuilder.append("NO").append("\n");




        }
        System.out.println(stringBuilder);
    }
}
