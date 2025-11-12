import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void calculateMortgage() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        int principal, period = 0;
        float annualInterestRate = 0;
        while(true) {
            System.out.print("Principal $1k - $1M: ");
            principal = scanner.nextInt();
            if(principal < 1000 || principal > 1_000_000)
                System.out.println("Enter a number between 1,000 and 1,000,000");
            else
                break;
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate <= 0 || annualInterestRate > 30)
                System.out.println("Enter a value greater than 0 or less than or equal to 30");
            else
                break;
        }

        while(true){
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if(period <= 0 || period > 30)
                System.out.println("Enter a number between 1 and 30");
            else
                break;
        }

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR/PERCENT;
        int numberOfPayments = Math.round((float)period * MONTHS_IN_YEAR);

        //mortgage calculation
        double Mortgage = principal
            * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments)) /
            (Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
         String MortgageFormat = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage: " + MortgageFormat);
    }
}
