import java.time.LocalDate;

public interface IReportGenerator {
    String generateFinancialReport(LocalDate startDate, LocalDate endDate);
}
