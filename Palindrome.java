import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int first = 0;
        int last = s.length()-1;
        boolean isp = true;
        while(first<last){
            if(s.charAt(first)!=s.charAt(last)){
                isp=false;
                break;
            }
            first++;
            last--;
        }
        if(isp){
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
    }
 }
}
