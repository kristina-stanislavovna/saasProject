import java.math.BigDecimal;

public interface IPaymentGateway {
    String processPayment(BigDecimal amount, String currency);

    String refundTransaction(String transactionId);
}
