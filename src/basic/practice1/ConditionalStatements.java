package basic.practice1;

import java.util.Scanner;
//also use scanner class to allow input of data
public class ConditionalStatements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("a is the greatest digit");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest digit");
        } else if (c > a && c > b) {
            System.out.println("c is the greatest digit");
        }

    }

}

