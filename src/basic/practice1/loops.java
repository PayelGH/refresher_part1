package basic.practice1;
//statement / operation repeated multiple times based on conditions
//while loop: condition first : statement/code block later : if condition is true only then it will enter into the block
//otherwise it will just exit the loop
//do while : code will execute once before following condition even if condition is false
//for loop : initialization , condition and increment together, suitable for defined limits

import java.util.Scanner;
//IMPORTANT : Practice link: http://www.beginwithjava.com/java/loops/questions.html
public class loops {
    public static void main(String[] args){
 //example to print numbers between 5 and 10
        int i=6;
        while(i<10){
            System.out.println(i);
            i++;
        }
        int i2=6;
        do{
            System.out.println(i2);
            i2++;
        }while(i2<10);

        System.out.println("***********************************");
        for(int j=6;j<=9;j++){
            System.out.println(j);
        }
        System.out.println("***********************************");
        //example2: to print all even numbers between 20 and 50, inclusive
        int k= 20;
        while(k<=50){
            System.out.println(k);
            k= k+2;
        }
        System.out.println("***********************************");
        //example3: to print all multiples of 10 between 0 to 100
        for(int l=0; l<=100; l=l+10){
            System.out.println(l);
        }
        //Write a program to calculate the sum of first 10 natural numbers (0 onwards)

       int sum =0;
       for(int m=0; m<=10; m++){
       sum = sum+m;
           System.out.println("The answer is "+ sum);
       }
       //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.

        System.out.println("************enter a positive integer**********");
        int userAnswer;
        Scanner scanner= new Scanner(System.in);
        userAnswer= scanner.nextInt();

        int userAnswerMult=1;
        for(int n=0; n<=12; n++){
            userAnswerMult= userAnswer*n;
            System.out.println(userAnswer + " x "+ n +" = "+userAnswerMult );
     }
    }
}
