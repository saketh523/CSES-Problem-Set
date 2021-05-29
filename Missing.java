/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Missing
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner s = new Scanner(System.in);
	    	long n = s.nextLong();
	    	long res = 0;
	    	long resu = 0;
	    	for(int i=0;i<n-1;i++){
	    	    res = s.nextLong();
	    	    resu = resu+res;
	    	}
	    	long total = (n*(n+1))/2;
	    	
	    	System.out.println(total-resu);
	}
}