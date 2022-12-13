 import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter year of birth");
        int yearBirth = input.nextInt();
        System.out.println("Enter month of birth");
        int monthBirth = input.nextInt();
        System.out.println("Enter day of birth");
        int dayBirth = input.nextInt();
        HeartRates firstPatient = new HeartRates(firstName, lastName, yearBirth, monthBirth, dayBirth);
        System.out.printf("Firstname is %s%n Lastname is %s%n Date of birth is %d/%d/%d%n Age is %d%n " +
                        "Maximum heart rate is %d%n Target heart rate is %d%n" ,
                firstPatient.getFirstName(), firstPatient.getLastName(), firstPatient.getDayBirth(),
                firstPatient.getMonthBirth(), firstPatient.getYearBirth(), firstPatient.age(),
                firstPatient.maxiHeartRate(), firstPatient.target());
    }
}

