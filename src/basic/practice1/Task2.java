package basic.practice1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
////        //Q1:sum of all array values, print all values in the array but skip 65
////        int a[]= {44, 65, 88};
////        //System.out.println("The sum is: "+(a[0] +a[1]+a[2]));
////
////        for(int i=0; i<a.length; i++){
////            if(a[i]==65){
////                continue;
////            }
////            System.out.println(a[i]);
////        }
////        //alternate
////        for(int j:a){
////            if(j==65){
////                continue;
////            }
////            System.out.println(j);
////        }
//
//        //Q2. find no of row and a specific number in 2 d array, print value but skip 56
//            int b[][]={{33, 23, 56},{77, 23, 98}};
////        System.out.println("number of rows: "+ b.length);
////        System.out.println("number of columns: "+b[0].length);
////        System.out.println("the value is: "+b[1][1]);
//
//        for(int k=0; k<b.length;k++){
//            for(int m=0;m<b[0].length;m++){
//                if(b[k][m]==56){
//                    continue;
//                }
//                System.out.println(b[k][m]);
//            }
//        }
//        //alternate
//        for(int n[]:b){
//            for(int o:n){
//                if(o==56){
//                    continue;
//                }
//                System.out.println(o);
//            }
//        }
//        //Q3: Array with string , print in one line, Find the location of "am"=s[2]
//        String s[] = {"Hi ", " I ", " am ", " Payel"};
//        for (String string : s) {
//            System.out.print(string);
//        }
//        //Q4:even and odd number in an array
//        int a2[] = {44, 65, 88, 77, 56, 87, 90};
//        for (int i : a2) {
//            if (i % 2 == 0) {
//                System.out.println("The even number is " + i);
//            }
//            if (i % 2 == 1) {
//                System.out.println("The odd number is " + i);
//            }
//        }
//        //Q5: smallest and greatest element in an array
//
//        int a3[] = {44, 65, 88, 77, 56, 87, 90, 99, 453, 854, 234};
//        int smallest =a3[0];
//        int greatest= a3[0];
//        for (int i=0; i<a3.length; i++){
//            if(a3[i]>greatest) greatest= a3[i];
//            else if (a3[i]<smallest) smallest=a3[i];
//        }
//        System.out.println("greatest value : "+greatest);
//        System.out.println("Smallest value : "+smallest);

        //Q6: add values of two matrices
        int arr1[][]={{10, 20 , 30},{5, 15, 55}};
        int arr2[][]={{20, 10, 15}, {50, 40, 10}};

        int arr3[][]= new int[2][3];//introducing third array
        System.out.println("The values of array arr3 are : ");

        for(int i=0; i< arr1.length && i< arr2.length; i++){
            for(int j=0; j<arr1[0].length && j<arr2[0].length; j++){

                arr3[i][j]= arr1[i][j]+ arr2[i][j];
                System.out.println(arr3[i][j]);
            }
        }
    }
}


