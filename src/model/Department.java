package model;

import java.util.ArrayList;

public class Department {

	private Office firstOffice;
	
	public Department() {
		firstOffice = null;
	}
	
	public void addOfficeFirst( String c, int f ) {
		Office newOffiece = new Office( c, f );
		if( firstOffice == null ) {
			firstOffice = newOffiece;
		}else {
			Office first = firstOffice;
			newOffiece.setNextOffice(first);
			firstOffice = newOffiece;
		}
	}
	
	public void addOfficeLast( String c, int f ) {
		Office newOffice = new Office( c, f );
		if( firstOffice == null ) {
			firstOffice = newOffice;
		}else {
			Office temporal = firstOffice;
			while( temporal.getNextOffice() != null ) {
				temporal = temporal.getNextOffice();
			}
			temporal.setNextOffice(newOffice);
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
	
	public boolean removeOffice( String c ) {
		boolean removed = false;
		if( firstOffice.getNextOffice() == null && firstOffice.getCode().equals(c) ) {
			firstOffice = null;
			removed = true;
		}else if( firstOffice.getNextOffice() != null && firstOffice.getCode().equals(c) ) {
			firstOffice = firstOffice.getNextOffice();
			removed = true;
		}else {
			Office previous = null;
			Office current = firstOffice;
			while( current.getNextOffice() != null && !(current.getCode().equals(c)) ) {
				previous = current;
				current = current.getNextOffice();
			}
			if( current.getNextOffice() != null && current.getCode().equals(c) ) {
				previous.setNextOffice(current.getNextOffice());
				removed = true;
			}else if( current.getNextOffice() == null && current.getCode().equals(c) ) {
				previous.setNextOffice(null);
				removed = true;
			}
		}
		return removed;
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
		if( firstOffice != null ) {
			if( ( firstOffice.getFloor() % 2 ) == 0 ) {
				if( firstOffice.getNextOffice() == null ) {
					firstOffice = null;
				}else {
					firstOffice = firstOffice.getNextOffice();
				}
			}
			Office previous = null;
			Office current = firstOffice;
			do {
				if( previous != null ) {
					if( ( current.getFloor() % 2 ) == 0 ) {
						if( current.getNextOffice() == null ) {
							previous.setNextOffice(null);
						}else {
							previous.setNextOffice(current.getNextOffice());
						}
					}
				}
				previous = current;
				current = current.getNextOffice();
			}while( current != null );
		}
	}
	
}
