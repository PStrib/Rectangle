import java.util.Scanner;

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