package basics.chapter002;

import java.util.Scanner;

// PP 2.4 Write a program that prompts for and reads a course name, its
// credits and reference book. Then print the following paragraph,
// inserting the appropriate data:
// This semester, a new course on course_name has been added
// to the curriculum. It consists of credits credits and
// the reference book for this course is reference_book.
public class Pp24 {
    public static void main (String[] args){
        String course_name, reference_book;
        int credits;

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the course name: ");
        course_name = scan.nextLine();
        System.out.println("enter the number of credits: ");
        credits = scan.nextInt();
        scan.nextLine(); // Consume the newline left-over
        System.out.println("enter the name of the reference book: ");
        reference_book = scan.nextLine();
        System.out.println("This semester, a new course on " + course_name +
                " has been added to the curriculum. It consists of " + credits +
                " credits and the reference book for this course is " + reference_book);
        scan.close();

    }
}
