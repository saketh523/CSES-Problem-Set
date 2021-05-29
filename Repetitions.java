/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Repetitions
{
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        long n = str.length();
        char prevChar = 'A';
        char currChar;
        long count = 1;
        long max = 0;
        for(int i=0;i<n;i++){
            currChar = str.charAt(i);
            if(currChar == prevChar){
                count+=1;
            }
            else{
                count = 1;
            }
        if(max < count){
            max = count;
        }
        prevChar = currChar;
        }
        System.out.print(max);
    }
}