package ObjectOrientedProgram;

class Teacher {
String designation = "Teacher";
String collegeName = "MLB";
void does () {
	System.out.println("Teaching");
}	
}
public class Social extends Teacher {
	String mainSubject = "Freeman";
	public static void main (String args[]) {
		Social obj = new Social ();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
}
