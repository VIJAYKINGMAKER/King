package ObjectOrientedProgram;

public abstract class Person1 {
	private String name;
	private String gender;
	public Person1(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}
	public abstract void studying();
	@Override
	public String toString() {
		return "Name=" +this.name +"Gender=" + this.gender;
	
	
	}
	public void Studying() {
		// TODO Auto-generated method stub
		
	}

}
