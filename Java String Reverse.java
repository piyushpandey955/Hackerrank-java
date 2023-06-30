import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String b=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String s[]=new String[b.length()];
        String r="";
        
        for(int i=b.length()-1;i>=0;i--){
            r=r+b.charAt(i);
        }
        
        if(b.compareTo(r)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



