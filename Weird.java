/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Weird
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner s = new Scanner(System.in);
	    	Long n = s.nextLong();
	    	// n even --> n/2
	    	// n odd  --> (n*3)+1
	    	// n = 1 stop
	    	compute(n);
	}
	public static void compute(Long n){
	    if(n==1){
	        System.out.print("1");
	       return;
	    }
	    else{
            if(n%2==0){
                System.out.print(n + " ");
                n = n/2;
                compute(n);
            }
            else{
                System.out.print(n + " ");
                n = (n*3)+1;
                compute(n);
            }
	    }
	}
}