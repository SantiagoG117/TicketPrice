/**
 * @author Santiago Garcia
 * @version 1.0
 * @see CalculateTicketPrice
 * @see ReportTicketPrice
 * @see CalculateTicketPrice
 * @see Customer
 * @since Java 17.0.6
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations
        Scanner scanner = new Scanner(System.in);
        CalculateTicketPrice calculate = new CalculateTicketPrice();
        ReportTicketPrice report = new ReportTicketPrice();
        Customer customer = new Customer();
        int age;
        double ticketPrice;

        //Inputs
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        scanner.close();

        //Calculations
        customer.setAge(age);
        ticketPrice = calculate.calculateTicketPrice(customer);

        //Outputs
        report.printTicketPrice(ticketPrice);
        System.out.println( "\n" + "Program by Santiago Garcia");
    }
}