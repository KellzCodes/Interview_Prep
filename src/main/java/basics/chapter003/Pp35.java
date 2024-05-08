package basics.chapter003;

import java.util.Scanner;
public class Pp35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first x coordinate: ");
        double x1 = scan.nextInt();
        System.out.print("Enter the second x coordinate: ");
        double x2 = scan.nextInt();

        System.out.print("Enter the first y coordinate: ");
        double y1 = scan.nextInt();
        System.out.print("Enter the second y coordinate: ");
        double y2 = scan.nextInt();

        double x = x2 - x1;
        double y = y2 - y1;

        double xSquared = Math.pow(x, 2);
        double ySquared = Math.pow(y, 2);

        double distance = Math.sqrt(xSquared - ySquared);
        System.out.println(distance);
    }
}
