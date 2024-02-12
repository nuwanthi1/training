import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter side length of the square:");
                double sideLength = scanner.nextDouble();
                Square square = new Square(sideLength);
                System.out.println("");
                System.out.println("Shape:Square");
                System.out.println("");
                System.out.println("Properties:");
                System.out.println("SideLength = "+sideLength);
                System.out.println("");
                System.out.println("Area: " + square.calculateArea());
                System.out.println("Perimeter: " + square.calculatePerimeter());

            }
            else if (choice == 2) {
                System.out.println("Enter height of the rectangle:");
                double height = scanner.nextDouble();
                System.out.println("Enter width of the rectangle:");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(height, width);
                System.out.println("");
                System.out.println("Shape:Rectangle");
                System.out.println("");
                System.out.println("Properties:");
                System.out.println("Height = "+height);
                System.out.println("Width = "+width);
                System.out.println("");
                System.out.println("Area: " + rectangle.calculateArea());
                System.out.println("Perimeter: " + rectangle.calculatePerimeter());
            }
            else if (choice == 3) {
                System.out.println("Enter radius of the circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("");
                System.out.println("Shape:Circle");
                System.out.println("");
                System.out.println("Properties:");
                System.out.println("Radius = "+radius);
                System.out.println("");
                System.out.println("Area: " + circle.calculateArea());
                System.out.println("Perimeter: " + circle.calculatePerimeter());
            }
            else if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            else {
                System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
