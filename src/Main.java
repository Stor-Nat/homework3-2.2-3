public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1year = service.calculate(1_000_000, 1);
        System.out.println(monthlyPayment1year);
        System.out.printf("Срок кредита 1 год, ежемесячный платеж = %.0f \n", monthlyPayment1year);
        System.out.println();

        double monthlyPayment2year = service.calculate(1_000_000, 2);
        System.out.println(monthlyPayment2year);
        System.out.printf("Срок кредита 2 года, ежемесячный платеж = %.0f \n", monthlyPayment2year);
        System.out.println();

        double monthlyPayment3year = service.calculate(1_000_000, 3);
        System.out.println(monthlyPayment3year);
        System.out.printf("Срок кредита 3 года, ежемесячный платеж = %.0f \n", monthlyPayment3year);
        System.out.println();
    }
}