package Recursion;

import java.util.*;

public class josephsproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                arrayList.add(i);
            }
            System.out.println(recur(arrayList, 0, k));
        }

    }
//    if (n == 1)
//            return 1;
//else
//    /* The position returned by josephus(n - 1, k)
//    is adjusted because the recursive call
//    josephus(n - 1, k) considers the original
//    position k%n + 1 as position 1 */
//        return (josephus(n - 1, k) + k-1) % n + 1;

    private static int recur(ArrayList<Integer> arrayList, int i, int k) {
        if(arrayList.size()==1)
            return arrayList.get(0);
        else {
           i=(i + (k - 1)) % arrayList.size();
           arrayList.remove(i);
            return recur(arrayList, i,k);
        }


    }
}
