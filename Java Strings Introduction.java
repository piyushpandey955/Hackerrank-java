import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l=0 , c=0;
        
        l=a.length()+b.length();
        System.out.println(l);
        
        c=a.compareTo(b);
        if(c>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String s=a.substring(0, 1);
        String s1=b.substring(0, 1);
        System.out.println(s.toUpperCase()+a.substring(1, a.length())+" "+s1.toUpperCase()+b.substring(1, b.length()));
    }
}




