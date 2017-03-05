
public class Note {
	private String lastName;
	private String firstName;
	private String dob;
	private int cellNum;
	

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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getCellNum() {
		return cellNum;
	}

	public void setCellNum(int cellNum) {
		this.cellNum = cellNum;
	}

	@Override
	public String toString() {

		return "FirsName: " + getFirstName() + System.lineSeparator() + "Last Name: " + getLastName()
				+ System.lineSeparator() + "DOB: " + getDob() + System.lineSeparator() + "CellPhone: " + getCellNum();
	}

}
