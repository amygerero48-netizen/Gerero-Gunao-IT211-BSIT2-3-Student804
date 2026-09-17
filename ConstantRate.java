public class ConstantRate {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 58.75;
        double usdAmount = 100;

        double peso = usdAmount * EXCHANGE_RATE;

        System.out.println("USD: " + usdAmount);
        System.out.println("PHP: " + peso);
    }
}