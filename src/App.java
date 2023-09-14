import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start year: ");
        int startYear = scanner.nextInt();

        System.out.print("Enter the end year: ");
        int endYear = scanner.nextInt();

        listDatesForYears(startYear, endYear);

        scanner.close();
    }

    public static void listDatesForYears(int startYear, int endYear) {
        LocalDate currentDate = LocalDate.of(startYear, 1, 1);
        LocalDate endDate = LocalDate.of(endYear, 1, 1);

        while (!currentDate.isEqual(endDate)) {
            String cleanedCurrentDate = currentDate.format(DateTimeFormatter.BASIC_ISO_DATE);
            String reversedCurrentDate = new StringBuilder(cleanedCurrentDate).reverse().toString();

            if (cleanedCurrentDate.equals(reversedCurrentDate)) {
                System.out.println(currentDate);
            }

            currentDate = currentDate.plusDays(1);
        }
    }
}
