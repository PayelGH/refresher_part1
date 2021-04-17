package basic.practice1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        //q1: get number from user : state its above 100 or below it
//        System.out.println("******enter 1 number*****");
//        int i;
//        Scanner scanner= new Scanner(System.in);
//        i= scanner.nextInt();
//
//        if(i>100){
//            System.out.println("Number is above 100");
//        }
//        else{
//            System.out.println("Number is less than 100");
//        }
        //q2: find the greatest of 3 numbers entered by user

//        System.out.println("******enter 3 numbers*****");
//        int j, k, l;
//        Scanner scanner2= new Scanner(System.in);
//        j=scanner2.nextInt();
//        k=scanner2.nextInt();
//        l=scanner2.nextInt();
//
//        if(j>k && j>l){
//            System.out.println(j +" is the greatest number");
//        }
//        if(k>j && k>l){
//            System.out.println(k +" is the greatest number");
//        }
//        if(l>k && l>j){
//            System.out.println(j +" is the greatest number");
//        }
//
//        //display mult table of 7 upto 12 times
//
//        int mult =1; int mult2=1;
//        for(int m=0; m<=12; m++){
//            mult2= mult*m;
//            System.out.println(7+" X "+m+ " = "+ mult2);
//        }
        //Q4: count the number of digits of the user entered number: when the number is unknown use while loop
        System.out.println("******enter 1 number*****");
        int n;
        Scanner scanner3= new Scanner(System.in);
        n= scanner3.nextInt();
        int NoOfDigits= 0;

        while(n>=1){
            n=n/10;
            NoOfDigits++;
        }
        System.out.println("Ans: "+ NoOfDigits);
    }
}
