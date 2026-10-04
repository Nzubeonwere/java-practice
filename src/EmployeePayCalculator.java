public class EmployeePayCalculator {
    public static void main(String[] args) {
        displayEmployeePaycheck(calculateEmployeePaycheck(50,40,5));
    }

    public static double calculateEmployeePaycheck (double hourlyRate, int hoursWorked, int rating) {
        double grossPay = hourlyRate * hoursWorked;
        double bonusAmount = 0;
        double tax = 0;

        if (rating == 5) {
            double bonusRate = 10/100.0;
             bonusAmount = bonusRate * grossPay;
        } else if (rating == 4) {
            double bonusRate = 5/100.0;
            bonusAmount = bonusRate * grossPay;
        }

        double totalPay = grossPay + bonusAmount;
        if (totalPay >= 1000) {
            double taxRate = 12/100.0;
            tax = taxRate * totalPay;
        } else {
            double taxRate = 8/100.0;
            tax = taxRate * totalPay;
        }
        return totalPay - tax;
    }

    public static void displayEmployeePaycheck(double finalPaycheck) {
        System.out.println("Weekly paycheck: $" + finalPaycheck);
    }
}
