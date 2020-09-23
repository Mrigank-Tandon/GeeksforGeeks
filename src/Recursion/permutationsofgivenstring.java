package Recursion;

import java.util.*;

public class permutationsofgivenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int[] fre = new int[26];
            f(fre, s);
            lexoperm("", s.length(), fre);
            System.out.println();
        }


    }

    private static void lexoperm(String processed, int length, int[] fre) {
        if(length==0){
            System.out.print(processed+" ");
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
                if(fre[i]>0){
                    fre[i]--;
                    lexoperm(processed+(char)(i+'A'),length-1,fre);
                    fre[i]++;

                }
        }

    }

    private static void f(int[] fre, String s) {
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            fre[c-'A']++;
        }
    }
}
