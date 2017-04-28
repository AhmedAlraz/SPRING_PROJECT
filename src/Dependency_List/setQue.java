package Dependency_List;

import java.util.List;
import java.util.Set;

public class setQue {

	private int Sid;
	private String Name;
	private Set answer;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
	public Set getAnswer() {
		return answer;
	}
	public void setAnswer(Set answer) {
		this.answer = answer;
	}
	public void Display(){
		System.out.println("Studentid"+"==="+"StudentName");
		System.out.println(Sid+"==="+Name);
	    System.out.println("Set==== Answers");
	    System.out.println(answer);
	
	}
}
