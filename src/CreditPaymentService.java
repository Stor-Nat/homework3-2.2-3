public class CreditPaymentService {
    public double calculate (int creditAmount, int creditTerm) {
        int month = creditTerm * 12;

        double interestRate = 9.99 / 12 / 100;
        double numerator = creditAmount * interestRate;

        double variable1 = 1 + interestRate;
        double variable2 = Math.pow(variable1, month);
        double variable3 = 1 / variable2;
        double denominator = 1 - variable3;

        double monthlyPaymentYear = numerator / denominator;
//        int monthlyPaymentYearInt = (int) monthlyPaymentYear;

        return monthlyPaymentYear;
    }
}
