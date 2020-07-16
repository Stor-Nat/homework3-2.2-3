public class CreditPaymentService {
    public double calculate (int CreditAmount, int CreditTerm) {
        int Month = CreditTerm * 12;

        double InterestRate = 9.99 / 12 / 100;
        double Numerator = CreditAmount * InterestRate;

        double Variable1 = 1 + InterestRate;
        double Variable2 = Math.pow(Variable1, Month);
        double Variable3 = 1 / Variable2;
        double Denominator = 1 - Variable3;

        double MonthlyPaymentYear = Numerator / Denominator;
//        int MonthlyPaymentYearInt = (int) MonthlyPaymentYear;

        return MonthlyPaymentYear;
    }
}
