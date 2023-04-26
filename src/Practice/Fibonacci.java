package Practice;

import java.util.Scanner;

public class Fibonacci {

    public static int function(int n){
        if(n==1|n==2)
        {return 1;}
        else {
            return function(n-1)+function(n-2);
        }
    }
    public static void main(String[] args) {
        int a=0,b=1,sum,n;
        System.out.println("please enter the number of n");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            int sum2=function(i);
            System.out.print(sum2+" ");
        }
    }

}
