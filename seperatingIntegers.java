import java.util.Scanner;

public class seperatingIntegers {
    public static void main(String[] args) {

        int a;
        int b;
        int counter = 0;

        int one;
        int two;
        int three;
        int four;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1/2): ");
        a = input.nextInt();
        System.out.print("Enter a number (2/2): ");
        b = input.nextInt();

        int divisionResult = a/b;
        int remainder =a%b;

        System.out.println("\nResult when divided: " + divisionResult);
        System.out.println("Remainder after division: " + remainder);

        System.out.println("\nEnter 5 random numbers: ");
        one = input.nextInt();
        two = input.nextInt();
        three = input.nextInt();
        four = input.nextInt();

        System.out.print(one + "  " + two + "  " + three + "  " + four);
    }
}
