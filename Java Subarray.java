import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int c=0;
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<0){
                    c++;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            c++;
        }
        
        System.out.println(c);
    }
}
