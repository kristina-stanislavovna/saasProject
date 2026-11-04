public interface INotificationService {
    void sendSms(String telephone, String message);

    void sendEmail(String mail, String subject, String body);
}
