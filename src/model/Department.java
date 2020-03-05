package model;

public class Department {

	private Office firstOffice;
	
	public Department() {
		firstOffice = null;
	}
	
	public void addOffice( String c, int f ) {
		Office of = new Office( c, f );
	}
	
	public Office searchOffice( String c ) {
		return null;
	}
	
	public Office removeOffice( String c ) {
		return null;
	}
	
	public void sortByCode() {
		
	}
	
	public void removeEvenFloors() {
		
	}
	
}
