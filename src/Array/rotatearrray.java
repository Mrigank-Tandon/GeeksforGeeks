package Array;

import java.util.*;

public class rotatearrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a =new int[n];
            for (int i = n-1; i>=0; i--) {
                a[(i+k)%n]=sc.nextInt();
            }
            for (int i = n-1; i >=0 ; i--) {
                stringBuilder.append(a[i]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);


    }
}
