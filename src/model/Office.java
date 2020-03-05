package model;

public class Office {
	
	private String code;
	private int floor;
	
	private Office nextOffice;
	
	private Professor prof;
	
	public Office( String code, int floor ) {
		this.code = code;
		this.floor = floor;
		this.nextOffice = null;
		this.prof = null;
	}

	public String getCode() {
		return code;
	}

	public int getFloor() {
		return floor;
	}

	public Office getNextOffice() {
		return nextOffice;
	}

	public Professor getProf() {
		return prof;
	}

	public void setNextOffice(Office nextOffice) {
		this.nextOffice = nextOffice;
	}
	
}
