import java.util.Scanner;

public class asterisksSquare {
    public static void main(String[] args) {

        for (int column = 0; column < 4; column++) {
            for (int row = 0; row < 4; row++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


// Next Exercise


        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char fill = input.next().charAt(0);

        for (int column = 0; column < 5; column++) {
            for (int row = 0; row < 5; row++) {
                System.out.print(fill);
            }
            System.out.println();
        }
        System.out.println();


// Next Exercise


        System.out.println("Enter a radius: ");
        int radius = input.nextInt();
        double areaOfCircle = 3.14159 * (radius * radius);
        System.out.printf("%.2f",areaOfCircle);

    }
}
