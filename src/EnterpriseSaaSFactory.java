public class EnterpriseSaaSFactory extends SaaSFactory{
    @Override
    public IPaymentGateway createPaymentGateway() {
        return new EnterprisePaymentGateway();
    }

    @Override
    public INotificationService createNotificationService() {
        return new EnterpriseNotificationService();
    }

    @Override
    public IReportGenerator createReportGenerator() {
        return new EnterpriseReportGenerator();
    }
}
