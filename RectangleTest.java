import java.util.Scanner;

class Rectangle {
    double length, width, area;
    String colour;

    Rectangle(double l, double w, String c) {
        length = l;
        width = w;
        colour = c;
        area = l * w;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first rectangle
        System.out.println("Enter length, width, colour of first rectangle:");
        Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next());

        // Input for second rectangle
        System.out.println("Enter length, width, colour of second rectangle:");
        Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.next());

        // Compare area and colour
        if (r1.area == r2.area && r1.colour.equalsIgnoreCase(r2.colour)) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-matching Rectangles");
        }

        sc.close();
    }
}
