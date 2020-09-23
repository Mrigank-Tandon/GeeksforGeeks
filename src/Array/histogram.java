package Array;

import java.util.*;

public class histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(minarea(a,0,a.length-1));

    }

    private static int minarea(int[] a, int si, int ei) {
        if(si==ei){
            return a[si];
        }
        if(si>ei){
            return 0;
        }
        int min =Integer.MAX_VALUE;
        int mi=-1;
        for (int i = si; i <=ei ; i++) {
            if(a[i]<min){
                min=a[i];
                mi=i;
            }
        }
        int maxarea=min*(ei-si+1);
        int lmax=minarea(a,si,mi-1);
        int rmax=minarea(a,mi+1,ei);
        return Math.max(maxarea,Math.max(lmax,rmax));

    }
}
