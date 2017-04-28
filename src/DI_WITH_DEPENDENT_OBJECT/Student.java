package DI_WITH_DEPENDENT_OBJECT;

public class Student {
private int Sid;
private String Sname;
private Address addre;
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public Address getAddre() {
	return addre;
}
public void setAddre(Address addre) {
	this.addre = addre;
}

public void DispInfo(){
	System.out.println("==="+"Sid"+"==="+"Sname");
	System.out.println("==="+Sid+"==="+Sname+" ===");
	System.out.println("==="+"Add"+"==="+"City"+"===="+"State ");
	System.out.println(addre);
}


	
}
