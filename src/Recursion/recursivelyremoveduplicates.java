package Recursion;

import java.util.*;
import java.lang.*;

class recursivelyremoveduplicates
{
    static String fn(String str)
    {
        if(str.equals(""))
            return "";

        int i;
        int n=str.length();

        Stack<Character> s=new Stack<>();
        boolean flag;

        for(i=0;i<n;i++)
            s.push(str.charAt(i));
        str="";
        char c=s.peek();
        flag=false;
        s.pop();
        int key=0;
        StringBuilder strBuilder = new StringBuilder(str);
        while(!s.isEmpty())
        {

            if(s.peek()==c)
            {
                flag=true;
                key=1;
            }
            else if(s.peek()!=c  )
            {
                if(!flag)
                    strBuilder.append(c);
                c=s.peek();
                flag=false;
            }
            s.pop();
        }
        str = strBuilder.toString();
        if(!flag)
            str+=c;
        StringBuilder ss=new StringBuilder(str);
        ss=ss.reverse();
        str=ss.toString();

        if(key==1)
            str=fn(str);
        return str;
    }

    public static void main (String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String str=sc.nextLine();


            System.out.println(fn(str));






        }

    }
}