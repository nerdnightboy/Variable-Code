/*
 * Q1 - Take 2 integer values in two variables x and y and print their product. (Easy)
Sample Input : x=2, y=4 (Both integers)
Sample Output : 8
 */
import java.util.Scanner;
public class Question1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of first variable : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of second variable : ");
        int b = sc.nextInt();
        System.out.println("Product of two variables is : " + (a * b));
    }
}