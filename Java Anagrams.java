import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String a=sc.next();
        String b=sc.next();
        
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        char c[]=a.toCharArray();
        Arrays.sort(c);
        
        char d[]=b.toCharArray();
        Arrays.sort(d);
        
        String e=new String(c);
        String f=new String(d);
        
        if(e.equals(f)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        
        
    }
}
