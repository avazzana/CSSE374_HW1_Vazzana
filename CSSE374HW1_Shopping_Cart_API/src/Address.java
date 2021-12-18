
public class Address {
	private String street;
	private String city;
	private State state;
	private int zip;
	
	public String getString() {
		return street + "\n" + city + state + zip;
	}

}
