import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {

        Random randomNumber = new Random();

        int [] totalFrequency = new int [11];
        int sumOfTwoValues = 0;

        for (int i = 0; i < 36000000; i++) {
            int firstDiceRoll = 1 + randomNumber.nextInt(6);
//            System.out.println("First Dice: " + firstDiceRoll);

            int secondDiceRoll = 1 + randomNumber.nextInt(6);
//            System.out.println("Second Dice: " + secondDiceRoll);

            sumOfTwoValues = firstDiceRoll + secondDiceRoll;
//            System.out.println("Sum: " + sumOfTwoValues);

            switch (sumOfTwoValues) {
                case 2:
                    totalFrequency[0]++;
                    break;
                case 3:
                    totalFrequency[1]++;
                    break;
                case 4:
                    totalFrequency[2]++;
                    break;
                case 5:
                    totalFrequency[3]++;
                    break;
                case 6:
                    totalFrequency[4]++;
                    break;
                case 7:
                    totalFrequency[5]++;
                    break;
                case 8:
                    totalFrequency[6]++;
                    break;
                case 9:
                    totalFrequency[7]++;
                    break;
                case 10:
                    totalFrequency[8]++;
                    break;
                case 11:
                    totalFrequency[9]++;
                    break;
                case 12:
                    totalFrequency[10]++;
                    break;
            }
        }
        System.out.println("Sum\t\tFrequency");
        System.out.printf("2\t\t%d\n3\t\t%d\n4\t\t%d\n5\t\t%d\n6\t\t%d\n7\t\t%d\n8\t\t%d\n9\t\t%d\n10\t\t%d\n11\t\t%d\n12\t\t%d", + totalFrequency[0],totalFrequency[1],totalFrequency[2],totalFrequency[3],totalFrequency[4],totalFrequency[5],totalFrequency[6],totalFrequency[7],totalFrequency[8],totalFrequency[9],totalFrequency[10]);
    }
}
