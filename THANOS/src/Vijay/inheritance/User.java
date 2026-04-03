package Vijay.inheritance;

public class User {

	public static void main(String[] args) {
		 
		Guest guest = new Guest();
		guest.read(); 
		
		Devloper dev = new Devloper();
		dev.read();
		dev.write();
		
		admin admin = new admin();
		admin.read();
		admin.write();
		admin.manage();

	}

}
