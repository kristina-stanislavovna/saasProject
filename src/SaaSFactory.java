public abstract class SaaSFactory {
    public abstract IPaymentGateway createPaymentGateway();
    public abstract INotificationService createNotificationService();
    public abstract IReportGenerator createReportGenerator();

}
