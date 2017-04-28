package Com.Autowire;

public class Address {
private String City ;
private String State ;
private Student std;

public Address(Student std) {
	System.out.println("Address constructor call");
	this.std=std;

}


public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
/*public Student getStd() {
	return std;
}
public void setStd(Student std) {
	this.std = std;
}

*/public void Disp(){
	System.out.println("City"+"==="+"State");
	System.out.println(City+"==="+State);
	std.Show();
}

}
