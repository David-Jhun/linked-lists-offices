package model;

import java.util.ArrayList;

public class Department {

	private Office firstOffice;
	
	public Department() {
		firstOffice = null;
	}
	
	public void addOffice( String c, int f ) {
		Office of = new Office( c, f );
		Office temp = null;
		if( firstOffice == null ) {
			firstOffice = of;
		}else {
			temp = firstOffice;
			while( temp.getNextOffice() != null ) {
				temp = temp.getNextOffice();
			}
			temp.setNextOffice(of);
		}
	}
	
	public Office searchOffice( String c ) {
		Office temp = null;
		if( firstOffice.getCode().equals(c) ) {
			temp = firstOffice;
		}else {
			temp = firstOffice;
			while( temp.getNextOffice() != null && !( temp.getCode().equals(c) ) ) {
				temp = temp.getNextOffice();
			}
		}
		return temp;
	}
	
	public Office removeOffice( String c ) {
		Office previous = null;
		Office current = null;
		if( firstOffice.getCode().equals(c) ) {
			firstOffice = firstOffice.getNextOffice();
		}else {
			current = firstOffice;
			while( current.getNextOffice() != null && !( current.getCode().equals(c) ) ) {
				
			}
		}
		return current;
	}
	
	public void sortByCode() {
		ArrayList<Office> vector = new ArrayList<Office>();
		Office temp = null;
		if( firstOffice.getNextOffice() == null ) {
			vector.add(firstOffice);
		}else {
			temp = firstOffice;
			while( temp != null ) {
				vector.add(temp);
				temp = temp.getNextOffice();
			}
		}
		
	}
	
	public void removeEvenFloors() {
		
	}
	
}
