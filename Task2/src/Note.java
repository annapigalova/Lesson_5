
public class Note {
	
	private String lastName;
	private String firstName;
	private int dob;
	private String cellNum;
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getCellNum() {
		return cellNum;
	}

	public void setCellNum(String cellNum) {
		this.cellNum = cellNum;
	}

	@Override
	public String toString() {

		return "FirsName: " + getFirstName() + System.lineSeparator() + "Last Name: " + getLastName()
				+ System.lineSeparator() + "DOB: " + getDob() + System.lineSeparator() + "CellPhone: " + getCellNum();
	}

}
