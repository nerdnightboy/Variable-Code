/*
 * Q4 - Write a Java program to calculate the cube of a number. (Easy)
Sample Input : 4
Sample Output : 64
The sizeof(bool) : 1 bytes
 */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("The cube of the number is : " + (x * x * x));
    }
}
