package HIbernateSample.HIbernateSample;

// Generated May 10, 2017 2:52:38 PM by Hibernate Tools 3.4.0.CR1
//srunjith
/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private int id;
	private String username;
	private String street;
	private String city;
	private String country;

	public Employee() {
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String username, String street, String city,
			String country) {
		this.id = id;
		this.username = username;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
