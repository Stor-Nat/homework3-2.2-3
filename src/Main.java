public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double MonthlyPayment1year = service.calculate(1_000_000, 1);
        System.out.println(MonthlyPayment1year);
        System.out.printf("Срок кредита 1 год, ежемесячный платеж = %.0f \n", MonthlyPayment1year);
        System.out.println();

        double MonthlyPayment2year = service.calculate(1_000_000, 2);
        System.out.println(MonthlyPayment2year);
        System.out.printf("Срок кредита 2 года, ежемесячный платеж = %.0f \n", MonthlyPayment2year);
        System.out.println();

        double MonthlyPayment3year = service.calculate(1_000_000, 3);
        System.out.println(MonthlyPayment3year);
        System.out.printf("Срок кредита 3 года, ежемесячный платеж = %.0f \n", MonthlyPayment3year);
        System.out.println();
    }
}