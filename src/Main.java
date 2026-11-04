import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String provider;

        if (args.length > 0) {
            provider = args[0];
        } else {
            provider = "enterprise";
        }


        SaaSFactory factory = switch (provider.toLowerCase()) {
            case "enterprise" -> new EnterpriseSaaSFactory();
            case "cloud" -> new CloudSaaSFactory();
            default -> throw new IllegalArgumentException("Unknown provider: " + provider);
        };
        BillingProcessor processor = new BillingProcessor(factory);
        System.out.println(
                processor.processPayment(new BigDecimal("100.00"), "USD")
        );
    }

}
