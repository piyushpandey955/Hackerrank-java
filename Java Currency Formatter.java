import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        
        Locale locale = new Locale("en","IN");
        String us="",india="",china="",france="";
        
        if(payment>=0 && payment<=1000000000){
            us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            india=NumberFormat.getCurrencyInstance(locale).format(payment);
            china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        }
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
