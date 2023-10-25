import java.util.Scanner;
import java.time.LocalDate;

public class UserDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        
        System.out.print("Enter your height in meters (e.g., 1.69): ");
        double heightMeters = scanner.nextDouble();

        
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;

      
        double heightCentimeters = heightMeters * 100;

        // Output the results
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + heightCentimeters + " centimeters");
    }
}

