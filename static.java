import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    Scanner sc=new Scanner(System.in);
    int B=sc.nextInt();
    int H=sc.nextInt();
    int flag=1;
    if(B<0 || H<0) {
        flag=0;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

