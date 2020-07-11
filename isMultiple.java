import java.util.Scanner;

public class isMultiple {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 0;

        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        firstNumber = input.nextInt();

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter a next number: ");
            secondNumber = input.nextInt();

            if (secondNumber % firstNumber == 0) {
                System.out.println("It's a multiple - true\n");

            } else {
                System.out.println("It's not a multiple - false\n");
            }

            System.out.println("Current number: " + firstNumber);
        }
        System.out.println("\nTest complete, thanks.");
    }
}
