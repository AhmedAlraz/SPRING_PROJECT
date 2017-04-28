package ConstructorInjection;

public class TextEditor {

	private SpellChecker spchk;

	public SpellChecker getSpchk() {
		return spchk;
	}

	public void setSpchk(SpellChecker spchk) {
		this.spchk = spchk;
	}
	
	public void CallDisp(){
		System.out.println("-----Text Editor Metod Call---");
		spchk.display();
	}
	
}
