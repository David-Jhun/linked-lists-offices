package model;

public class Office implements Comparable<Office>{
	
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
	
	

	@Override
	public String toString() {
		return "Office[" + code + "]";
	}

	@Override
	public int compareTo(Office office) {
		int result = 0;
		if( code.compareTo(office.code) < 0 ) {
			result = -1;
		}else if( code.compareTo(office.code) > 0 ) {
			result = 1;
		}else {
			if( floor < office.floor ) {
				result = -1;
			}else if( floor > office.floor ) {
				result = 1;
			}
		}
		return result;
	}
	
}
