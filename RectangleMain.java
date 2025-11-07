import java.util.*;
class Rectangle {
    double length, width, area;
    String color;
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter color: ");
        color = sc.next();
        area = length * width;
        System.out.println("Area = " + area);
    }
}
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.println("Enter details of first rectangle:");
        r1.getDetails();
        System.out.println("\nEnter details of second rectangle:");
        r2.getDetails();
        if (r1.area == r2.area && r1.color.equalsIgnoreCase(r2.color))
            System.out.println("\nMatching Rectangles");
        else
            System.out.println("\nNon-Matching Rectangles");
    }
}