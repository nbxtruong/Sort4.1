public class People {

	private final String familyName;

	private final String firstName;

	public People(String familyName, String firstName) {
		this.familyName = familyName;
		this.firstName = firstName;
	}

	public String familyName() {
		return familyName;
	}

	public String firstName() {
		return firstName;
	}
	
	public String toString() {
		return firstName + " " + familyName;
	}
}