import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter grade or -1 to opt out: ");

        double grade = 0;
        double num = 0;
        double sum = 0;

        while(grade != -1) {
            grade = inputNum.nextDouble();
            sum = sum + grade;
            num++;
        }
        System.out.println();
        System.out.println("The average is: " + sum/num);
    }
}
