package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1, "Shubham Saini", "shubham@123");
		Student s2 = new Student(2, "Nadeem Khan Chaurasia Newton", "nadeem@123");
		System.out.println(s.getRollNumber());
		System.out.println(s2.getRollNumber()+" - "+s2.getName()+" - "+s2.getEmail());
		System.out.println(s.equals(s2));
	}

}
