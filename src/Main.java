import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        BigDecimal paymentOneYear = service.calculate (1,1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год — " + paymentOneYear);

        BigDecimal paymentTwoYears = service.calculate (2,1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года — " + paymentTwoYears);

        BigDecimal paymentThreeYears = service.calculate (3,1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года — " + paymentThreeYears);
    }
}


