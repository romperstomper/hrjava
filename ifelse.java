import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if (between(n, 2, 5)) {
                ans = "Not Weird";
            } else if (between(n, 6, 20)) {
                              ans = "Weird";

            } else if (n > 20) {
                                    ans = "Not Weird";

            }
           //Complete the code
               
        }
        System.out.println(ans);
        
    }
        public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
            if (i >= minValueInclusive && i <= maxValueInclusive)
                return true;
        else
                return false;
    }
}

