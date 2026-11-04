public class CloudNotificationService implements INotificationService{
    @Override
    public void sendSms(String telephone, String message) {
        System.out.println("Cloud notification SMS: " + telephone );
    }

    @Override
    public void sendEmail(String mail, String subject, String body) {
        System.out.println("Cloud notification mail: " + mail);
    }
}
