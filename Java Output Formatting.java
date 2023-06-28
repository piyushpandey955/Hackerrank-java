import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            //String s="qqqqqqqqqqqqqqq";
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int a=s1.length();
                int x=sc.nextInt();
                //Complete this line
                System.out.println(s1+String.format("%" +(15-a)+ "s", "")+String.format("%03d",x));
            }
            
            
            System.out.println("================================");

    }
}


