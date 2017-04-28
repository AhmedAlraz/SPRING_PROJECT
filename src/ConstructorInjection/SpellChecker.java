
package ConstructorInjection;



public class SpellChecker {

	private int ID;

	private String name;
	
	public SpellChecker(){
		System.out.println("default");
	}
	

	public SpellChecker(int ID){
		
		this.ID=ID;
		System.out.println("Perametrized");
	}
	
	public SpellChecker(int ID,String name) {
     
		System.out.println("-----CONSTRUCTOR INITILIZE----");
		
		this.ID=ID;
        this .name=name;
	System.out.println("-----VALUE SET----");
	}
	
	
	
public 	void display(){
	System.out.println("ID"+"====="+"Name");

	System.out.println(ID+"====="+name);
}
	
}
