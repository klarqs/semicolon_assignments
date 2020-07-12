import java.util.Scanner;

public class RectangleClass {
    private double length;
    private double width;

    public RectangleClass(double length, double width) {

        this.length = length;
        this.width = width;
    }

    static double calPerimeter(double length, double width) {
        double perimeter = (length + length) + (width + width);
        return perimeter;
    }

    static double calArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {

        System.out.println("\nHey! \nThis calculates the Area and Perimeter of a Rectangle..\n");

        double length = 0.0;
        double width = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length (between 0.0 and 20.0): ");
        int j = input.nextInt();
            if (j < 0.0 || j > 20.0) {
                throw new IllegalArgumentException("Length is out of range.");
            } else {
                length = j;
            }

        System.out.print("Enter Width (between 0.0 and 20.0): ");
        int i = input.nextInt();
            if (i < 0.0 || i > 20.0) {
                throw new IllegalArgumentException("Length is out of range.");
            } else {
                width = i;
            }

        System.out.printf("\nLength %.2f and Width %.2f.\n_________\nPerimeter: %.2f\nArea: %.2f\n", length, width, calPerimeter(length, width), calArea(length, width));
    }
}

