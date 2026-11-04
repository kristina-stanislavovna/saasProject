import java.math.BigDecimal;

public class CloudPaymentGateway implements IPaymentGateway {

    @Override
    public String processPayment(BigDecimal amount, String currency) {
        return "Cloud rest API: " + amount  + currency;
    }

    @Override
    public String refundTransaction(String transactionId) {
        return "Cloud REST API: refund transaction" + transactionId ;
    }
}
