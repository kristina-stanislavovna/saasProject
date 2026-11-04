public class CloudSaaSFactory extends  SaaSFactory{
    @Override
    public IPaymentGateway createPaymentGateway() {
        return new CloudPaymentGateway();
    }

    @Override
    public INotificationService createNotificationService() {
        return new CloudNotificationService();
    }

    @Override
    public IReportGenerator createReportGenerator() {
        return new CloudReportGenerator();
    }
}
