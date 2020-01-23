package assign.dbaccess;

public class UsrVOO {
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String country;
	private String phone;
	private String accno;
	private String ssn;
	
	/**
	 * 
	 */
	public UsrVOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param gender
	 * @param address
	 * @param city
	 * @param state
	 * @param country
	 * @param phone
	 * @param accno
	 * @param ssn
	 */
	public UsrVOO(String firstName, String middleName, String lastName, String gender, String address, String city,
			String state, String country, String phone, String accno, String ssn) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
		this.accno = accno;
		this.ssn = ssn;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the accno
	 */
	public String getAccno() {
		return accno;
	}
	/**
	 * @param accno the accno to set
	 */
	public void setAccno(String accno) {
		this.accno = accno;
	}
	/**
	 * @return the ssString
	 */
	public String getSsnString() {
		return ssn;
	}
	/**
	 * @param ssString the ssString to set
	 * @param ssn 
	 */
	public void setSsnString(String ssn) {
		this.ssn = ssn;
	}

}
