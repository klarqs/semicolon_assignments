import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("isEven\n");
            } else {
                System.out.println("isOdd\n");
            }
        }
    }
}
