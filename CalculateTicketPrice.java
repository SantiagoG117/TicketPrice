/**
 * @author Santiago Garcia
 * @version 1.0
 * @see CalculateTicketPrice
 * @see ReportTicketPrice
 * @see Main
 * @since Java 17.0.6
 * Description: calculates the ticket price of a given customer.
 */
public class CalculateTicketPrice {

    /**
     * @param customer
     * @return the ticket price based on the age of the customer. If the value of age is an invalid value, sets the value of the
     * 	 ticket to -1.00 and returns it.
     */
    public double calculateTicketPrice(Customer customer) {
        double price;

        //If age is an invalid value (is lower than 0 or higher than 110):	set price to -1.00
        if (customer.getAge() < 0 || customer.getAge() >= 110)
            price = -1.0;
            //If age is between 0 (inclusive) and 3 years (exclusive):	        set price to $0.
        else if (customer.getAge() < 3)
            price =  0.0;
            //If age is between 3 and 13: (both inclusive):				        set price to $7.99
        else if (customer.getAge() <= 13)
            price = 7.99;
            //If age is between 14 (inclusive) and 65 (exclusive):		        set price to $10.99
        else if (customer.getAge() < 65)
            price = 10.99;
            //If age is higher than 65 (inclusive):						        set price to $8.50
        else
            price = 8.50;

        return price;
    }
}
