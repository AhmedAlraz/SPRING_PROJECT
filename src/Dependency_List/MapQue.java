package Dependency_List;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapQue {

	private int Sid;
	private String Name;
	private Map answer;
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
		
	
	public Map getAnswer() {
		return answer;
	}
	public void setAnswer(Map answer) {
		this.answer = answer;
	}
	public void Display(){
		System.out.println("Studentid"+"==="+"StudentName");
		System.out.println(Sid+"==="+Name);
	    System.out.println("Map==== Answers");
	    System.out.println(answer);
	
	}
}
