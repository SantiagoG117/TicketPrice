/**
 * @author Santiago Garcia
 * @version 1.0
 * @see CalculateTicketPrice
 * @see Customer
 * @see Main
 * @see CalculateTicketPrice
 * @since Java 17.0.6
 * Description: Prints the value of each ticket
 */

public class ReportTicketPrice {

    // Public methods:
    /**
     *
     * @param ticketPrice
     * If the value of ticketPrice is -1. it would mean the value for age, inputted by the user, is invalid.
     * If this is the case, the method will return an "Invalid age entered" message. Otherwise, it would
     * print the value of the ticket price formatted to 2 decimal points.
     */
    public void printTicketPrice(double ticketPrice) {
        if (ticketPrice == -1)
            System.out.println("Invalid age entered");
        else
            System.out.printf("The price is: " + "$" + String.format("%.2f", ticketPrice));
    }
}
