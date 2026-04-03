package Vijay.inheritance;

public class admin extends Devloper {
		
		// Adding or deleting the products/application
		public void manage() {
			super.read();
			write ();
			System.out.println("Manage Code now");
			
		}
		
		public void read () {
			System.out.println("Admin manage code");
		}
}


