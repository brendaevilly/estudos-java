package entities;

public class Students {
	
	private String name, eMail;
	private int roomNumber;
	
	public Students(String name, String eMail, int roomNumber) {
		super();
		this.name = name;
		this.eMail = eMail;
		this.roomNumber = roomNumber;
	}

	public String getName() {
		return name;
	}

	public String geteMail() {
		return eMail;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	
	
}
