package model;

import java.util.Comparator;

public class Professor implements Comparator<Professor>{

	private String name;
	private String id;
	
	public Professor( String name, String id ) {
		this.name = name;
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public int compare(Professor arg0, Professor arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
