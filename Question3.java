/*
 * Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. (Easy)
Sample Input : 7, 4
Sample Output : 28
 */
import java.util.*;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        int bre = sc.nextInt();
        System.out.println("The area of rectangle is : " + (len + bre));
    }
}
