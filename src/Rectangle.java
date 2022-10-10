import java.util.Scanner;
/**
 * Program to find the perimeter, area and diagonal length of a rectangle of dimensions defined by the user
 * @author Peter Stribblehill
 * @version 10/10/2022
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter the length an breadth of your rectangle, seperated by a space");
        double length=scan.nextDouble();
        double width=scan.nextDouble();
        System.out.println("The perimeter is "+(length*2+width*2));
        System.out.println("The area of your rectangle is "+length*width);
        System.out.println("The length of the diagonal is "+Math.hypot(length,width));
    }
}