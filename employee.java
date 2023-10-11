import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class October2023Calendar {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, Month.OCTOBER, 1);
        LocalDate end = LocalDate.of(2023, Month.OCTOBER, 31);

        // Generate the October 2023 calendar
        printCalendar(start, end);

        // Calculate the number of working days between two dates
        LocalDate fromDate = LocalDate.of(2023, Month.OCTOBER, 5); // Start date
        LocalDate toDate = LocalDate.of(2023, Month.OCTOBER, 20);  // End date
        int workingDays = calculateWorkingDays(fromDate, toDate);
        System.out.println("Number of working days between " + fromDate + " and " + toDate + ": " + workingDays);
    }

    public static void printCalendar(LocalDate start, LocalDate end) {
        LocalDate date = start;
        System.out.println("October 2023 Calendar:");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        while (!date.isAfter(end)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
            System.out.printf("%3d ", date.getDayOfMonth());
            date = date.plusDays(1);
        }
        System.out.println();
    }

    public static int calculateWorkingDays(LocalDate fromDate, LocalDate toDate) {
        int workingDays = 0;
        LocalDate date = fromDate;

        while (!date.isAfter(toDate)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            date = date.plusDays(1);
        }
        return workingDays;
    }
}
