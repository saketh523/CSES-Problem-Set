import java.io.*;
import java.util.*;
public class Beautiful{
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);
        long n = s.nextLong();
        if(n>=2 && n<4){
            System.out.print("NO SOLUTION");
            return;
        }
        if(n==1){
            System.out.print("1");
            return;
        }
        for(long j=2;j<=n;j=j+2){
            System.out.print(j+ " ");
        }
        for(long i=1;i<=n;i=i+2){
            System.out.print(i + " ");
        }
    }
}