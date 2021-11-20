import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag = checkInput();


    static boolean checkInput() {
        boolean tFlag = true;
        if (B <= 0) tFlag = false;
        if (H <= 0) tFlag = false;
        if (!tFlag) System.out.print("java.lang.Exception: Breadth and height must be positive");
        return tFlag;
    }
    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

