package Com.Spring;

public class Student {

	private  String sname;
	
	public Student() {
		System.out.println("Welcome to Constructor");}

	public String getSname() {
		System.out.println("Welcome to GetMethod");
		
		return sname;
	}

	public void setSname(String sname) {
		System.out.println("Welcome to SetMethod");
		this.sname = sname;
	}
	
	public void display(){
		System.out.println("Hello"+" "+ sname);
	}
	
	
}
