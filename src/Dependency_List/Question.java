package Dependency_List;

import java.util.List;

public class Question {

	private int Sid;
	private String Name;
	private List answer;
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
	public List getAnswer() {
		return answer;
	}
	public void setAnswer(List answer) {
		this.answer = answer;
	}
	
	
	public void Display(){
		System.out.println("Studentid"+"==="+"StudentName");
		System.out.println(Sid+"==="+Name);
	    System.out.println("List Answers");
	    System.out.println(answer);
	
	}
}
