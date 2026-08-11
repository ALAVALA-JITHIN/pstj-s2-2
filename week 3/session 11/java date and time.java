import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Name: " + name);
        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current Date and Time: " + dateTime);

        sc.close();
    }
}
//out put

Enter your name: Jithin
Name: Jithin
Current Date: 2026-08-11
Current Time: 11:50:25.123456700
Current Date and Time: 2026-08-11T11:50:25.123456700
