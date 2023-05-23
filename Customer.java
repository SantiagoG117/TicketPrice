/**
 * @author Santiago Garcia
 * @version 1.0
 * @see CalculateTicketPrice
 * @see ReportTicketPrice
 * @see Main
 * @since Java 17.0.6
 * Description: contains the data for each customer
 */
public class Customer {
	// Attributes:
	private int age;

	// Constructors:
    // no-argument constructor, sets age to zero:
	public Customer() {
		this(0);
	}

    //Parameterized constructor. Accepts as value the age attribute
	public Customer(int age) {
		this.age = age;
	}

	//Getters and setters

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	
}
