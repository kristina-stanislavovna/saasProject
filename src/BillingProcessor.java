import java.math.BigDecimal;
import java.time.LocalDate;

public class BillingProcessor {
    private final IPaymentGateway paymentGateway;
    private final INotificationService notificationService;
    private final IReportGenerator reportGenerator;

    public BillingProcessor(SaaSFactory saaSFactory) {
        this.paymentGateway = saaSFactory.createPaymentGateway();
        this.notificationService = saaSFactory.createNotificationService();
        this.reportGenerator = saaSFactory.createReportGenerator();
    }

    public String processPayment(BigDecimal amount, String currency) {
        return paymentGateway.processPayment(amount, currency);
    }

    public String refundTransaction(String transactionId) {
        return paymentGateway.refundTransaction(transactionId);

    }

    public void sendSms(String telephone, String message) {
        notificationService.sendSms(telephone, message);
    }

    public void sendEmail(String mail, String subject, String body) {
        notificationService.sendEmail(mail, subject, body);
    }

    public String generateFinancialReport(LocalDate startDate, LocalDate endDate) {
        return reportGenerator.generateFinancialReport(startDate, endDate);
    }


}
