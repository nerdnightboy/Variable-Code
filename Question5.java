/*
 * Q5 - Write a Java program to swap two numbers with the help of a third variable.
 * Sample Input : 2,3
Sample Output : 3,2
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of first number is : " + a);
        System.out.println("The value of second number is : " + b);
    }
}
