package basic.practice1;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class MakeACalculator {
    public static void main(String[] args) {
        System.out.println("***********Welcome to Make A Calculator");
        System.out.println("Choose any 1 option");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mod");
        System.out.println("Enter the selected number: ");
        int selection, integerOne, integerTwo;
        Scanner scanner = new Scanner(System.in);// scanner class to allow user to input data

        selection = scanner.nextInt(); //will allow to enter selection
        if(selection<1 ||selection>5){
            System.out.println("incorrect entry , try again");
            System.exit(0);// to exit from here
        }
        else  {
            System.out.println("Enter two integer values: ");
        }

        integerOne = scanner.nextInt();
        integerTwo = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println(integerOne + integerTwo);
                break;
            case 2:
                System.out.println(integerOne - integerTwo);
                break;
            case 3:
                System.out.println(integerOne * integerTwo);
                break;
            case 4:
                System.out.println(integerOne / integerTwo);
                break;
            case 5:
                System.out.println(integerOne % integerTwo);
                break;
        }
    }
}

