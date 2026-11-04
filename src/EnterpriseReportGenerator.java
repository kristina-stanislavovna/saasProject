import java.time.LocalDate;

public class EnterpriseReportGenerator implements IReportGenerator {
    @Override
    public String generateFinancialReport(LocalDate startDate, LocalDate endDate) {
        return "<report>\n" +
                "    <startDate>" + startDate + "</startDate>\n" +
                "    <endDate>" + endDate + "</endDate>\n" +
                "</report>";
    }
}
