package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray implements PrintArray {
    int myArray[]=new int[10];
    Scanner scan=new Scanner(System.in);
//    MyArray(){
//        System.out.println("please enter ten words");
//        for (int i = 0; i <myArray.length; i++) {
//            myArray[i]=scan.nextInt();
//        }
//    }

    public int binarySearch(int p)
    {
        return Arrays.binarySearch(myArray,p);
    }

    public void sort(){
        Arrays.sort(myArray);
    }

    public int index(int x) {
        int i;
        for ( i = 0; i < myArray.length; i++) {
            if (myArray[i]==x)
            {
                break;
            }
        }
        return i;
    }

    public void inset(){

    }

    @Override
    public void print() {
        for (int poi :
                myArray) {
            System.out.println(poi);
        }
    }

    public void reverse(int[] array,int n){
        int[] reverseArray=new int[n];
        int m=n-1;
        for (int i = 0; i < n; i++) {
            reverseArray[m]=array[i];
            m--;
        }
        for (int i :
                reverseArray) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

}
