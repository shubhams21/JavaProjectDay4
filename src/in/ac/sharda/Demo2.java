package in.ac.sharda;

public class Demo2 {

	public static void main(String[] args) {
		IResultArrivedListener iral= new Student(1,"Shubham", null);
		iral.resultArrived();
		iral = new Department(1);
		iral.resultArrived();
			}
			
			
		
		IResultArrivedListener iral2 = new IResultArrivedListener() {

			@Override
			public void resultArrived() {
				System.out.println(2);
				
			}
			
		};
	
}
