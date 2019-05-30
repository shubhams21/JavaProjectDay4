package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		
		University u = new University();
		for(int i=1;i<21;i++) {
			boolean added = u.addDepartments(new Department(1));
			if(added) {
				System.out.println("Department Added");
			}else {
				System.out.println("Not Added");
			}
		}
		
		u.printDepartment();

	}

}
