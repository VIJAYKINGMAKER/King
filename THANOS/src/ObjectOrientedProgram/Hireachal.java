package ObjectOrientedProgram;

public class Hireachal {

	class One {
	    public void print_Dell() {
	        System.out.println("Dell");
	    }
	}

	// Intermediate class
	class Two extends One {
	    public void print_Happy() {
	        System.out.println("Happy");
	    }
	}

	// Derived class
	class Three extends One {
		public void print_Learning() {
	        System.out.println("Learning");
	    }
	}
	    
	}

	// Main class with the main method
	class main {
		 public static void main(String[] args) {
		        Two obj1 = new Two();
		        obj1.print_Dell();     // From One
		        obj1.print_Hard();    // From Two

		        Three obj2 = new Three();
		        obj2.print_Dell();     // From One
		        obj2.print_Learning(); // From Three
		    }
		}


