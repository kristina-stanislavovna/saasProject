public class EnterpriseNotificationService implements INotificationService{
    @Override
    public void sendSms(String telephone, String message) {
        System.out.println("Enterprise Legacy SMS " + telephone);
    }

    @Override
    public void sendEmail(String mail, String subject, String body) {
        System.out.println("Enterprise Legacy mail " + mail);
    }
}
