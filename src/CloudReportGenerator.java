import java.time.LocalDate;

public class CloudReportGenerator implements IReportGenerator {
    @Override
    public String generateFinancialReport(LocalDate startDate, LocalDate endDate) {
        return "{\n" +
                "  \"startDate\": \"" + startDate + "\",\n" +
                "  \"endDate\": \"" + endDate + "\"\n" +
                "}";
    }
}
