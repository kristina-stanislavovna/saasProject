import java.math.BigDecimal;


public class EnterprisePaymentGateway implements IPaymentGateway{
    @Override
    public String processPayment(BigDecimal amount, String currency) {
        return "Enterprise SOAP: payment :" + amount + " " + currency;
    }

    @Override
    public String refundTransaction(String transactionId) {
        return "Enterprise SOAP: refund transaction: " + transactionId;
    }

}
