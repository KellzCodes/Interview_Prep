package basics.chapter002;

import java.util.Scanner;

// PP 2.2 Write a program that reads four integers and prints the sum of
// their squares.
public class Pp22 {
    public static void main(String[] args){
        int first, second, third, fourth;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number: ");
        first = scan.nextInt();
        System.out.println("enter the second integer: ");
        second = scan.nextInt();
        System.out.println("enter the third integer: ");
        third = scan.nextInt();
        System.out.println("enter the fourth integer: ");
        fourth = scan.nextInt();
        int firstSq = first * first;
        int secondSq = second * second;
        int thirdSq = third * third;
        int fourthSq = fourth * fourth;
        System.out.println(firstSq + secondSq + thirdSq + fourthSq);
        scan.close();
    }
}
