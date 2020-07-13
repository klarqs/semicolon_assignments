public class SavingsAccount {

    private double accountBalance;
    private static double annualInterestRate;

    public SavingsAccount(double accountBalance, double annualInterestRate) {
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    static double getMonthlyInterestRate (double annualInterestRate) {
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }

    static double calAnnualInterest (double accountBalance, double annualInterestRate) {
        return accountBalance + (annualInterestRate * accountBalance);
    }

    public static void main(String[] args) {

        double accountBalanceSaver1 = 2000.00;
        double accountBalanceSaver2 = 3000.00;
        double annualInterestSaver1 = 0.04;
        double annualInterestSaver2 = 0.04;

        SavingsAccount saver1 = new SavingsAccount(accountBalanceSaver1, annualInterestSaver1);
        SavingsAccount saver2 = new SavingsAccount(accountBalanceSaver2, annualInterestSaver2);

        System.out.println("\nSavings Account Interest Calculator\n");

        System.out.printf("Annual interest - Saver1: %.2f\n", saver1.calAnnualInterest(accountBalanceSaver1, annualInterestSaver1));
        System.out.printf("Annual interest - Saver2: %.2f\n", saver2.calAnnualInterest(accountBalanceSaver2, annualInterestSaver2));

        System.out.println();

        double accBalPlusAnnualInt1 = saver1.calAnnualInterest(accountBalanceSaver1, annualInterestSaver1);
        double plusMonthlyInt1 = accBalPlusAnnualInt1 + (accBalPlusAnnualInt1 * saver1.getMonthlyInterestRate(0.05));

        double accBalPlusAnnualInt2 = saver2.calAnnualInterest(accountBalanceSaver2, annualInterestSaver2);
        double plusMonthlyInt2 = accBalPlusAnnualInt2 + (accBalPlusAnnualInt2 * saver2.getMonthlyInterestRate(0.05));

        System.out.printf("Plus a month interest - Saver1: %.2f\n", plusMonthlyInt1);
        System.out.printf("Plus a Month interest - Saver2: %.2f\n", plusMonthlyInt2);



    }
}
