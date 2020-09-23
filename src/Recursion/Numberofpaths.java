package Recursion;

import java.util.*;

public class Numberofpaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(mazepathcnt(a,b));
        }


    }
    public static int mazepathcnt(int row, int col){

        if(row==1 || col==1){
            return 1;
        }

        return mazepathcnt(row-1,col)+ mazepathcnt(row,col-1);
    }
}
