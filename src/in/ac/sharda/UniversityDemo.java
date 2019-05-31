package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		
	//I am adding a comment
		
		University u = new University();
		for(int i=1;i<21;i++) {
			Department d = new Department(i);
			boolean added = u.addDepartments(new Department(1));
			if(added) {
				System.out.println("Department Added");
				for(int j = 1; j<21; j++); {
					d.addStudent(new Student(i, "Name"+i,null));
				}
			}else {
				System.out.println("Not Added");
			}
		}
		
		u.printDepartment();
		u.resultDeclared();

	}

}
