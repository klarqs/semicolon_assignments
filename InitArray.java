public class InitArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.println("\nHey, I print the total index and default values in an empty Array of 10");
        System.out.printf("\n%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 7 || counter == 9) // Skips the 7th and 9th positions
                continue;
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
