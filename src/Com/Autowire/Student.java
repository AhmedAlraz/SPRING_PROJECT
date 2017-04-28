package Com.Autowire;

public class Student {
	
	private int Sid;
	private String Sname;
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
	
	public void Show(){
		System.out.println("SID"+"===="+"SNAME");
		System.out.println(Sid+"===="+Sname);
		}
	
	
	

}
