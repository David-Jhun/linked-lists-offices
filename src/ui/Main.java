package ui;

import model.Department;

public class Main {
	
	private Department department;
	
	public Main() {
		department = new Department();
	}
	
	public void init() {
		department.addOfficeSorted("aaaa", 1);
		department.addOfficeSorted("zzzzz", 1);
		department.addOfficeSorted("cccc", 3);
		department.addOfficeSorted("gggg", 2);
		department.addOfficeSorted("bbbb", 4);
		department.addOfficeSorted("eeee", 89);
		System.out.println(department.showOffices());
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.init();
	}

}
