package study.hw;

public class Address {

	private String area;
	private String city;
	private String state;
	private String country;
	private long pin;

	public Address() {

	}

	public Address(String area, String city, String state, String country, long pin) {
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}






}
