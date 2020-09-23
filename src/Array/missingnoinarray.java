package Array;

import java.util.*;

public class missingnoinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
int sum=0;
int i;
            for ( i = 1; i <=n ; i++) {
              sum+=i ;
            }
            int sum1=0;
            for (int j = 0; j < n-1; j++) {
                sum1+=sc.nextInt();
            }
            System.out.println(sum-sum1);
        }

    }
}
