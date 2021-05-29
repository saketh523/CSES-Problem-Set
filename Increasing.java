/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Increasing
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long ar[] = new long[n];
        long val = 0;
        long res = 0;
        for(int a=0;a<n;a++){
            ar[a]= s.nextLong();
        }
        for(int i=0;i<n-1;i++){
            if(ar[i+1] < ar[i]){
                val = ar[i]-ar[i+1];
                res = res+val;
            }
        }
    System.out.print(res);

   }
}