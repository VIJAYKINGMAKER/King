package ObjectOrientedProgram;

// Base class
class One {
    public void print_Dell() {
        System.out.println("Dell");
    }
}

// Intermediate class
class Two extends One {
    public void print_Hard() {
        System.out.println("Hard");
    }

	public void print_Happy() {
		// TODO Auto-generated method stub
		
	}

	public void print_Happy1() {
		// TODO Auto-generated method stub
		
	}

	public void print_Dell() {
		// TODO Auto-generated method stub
		
	}
}

// Derived class
class Three extends Two {
    public void print_Learning() {
        System.out.println("Learning");
    }

	public void print_Happy() {
		// TODO Auto-generated method stub
		
	}

	public void print_Hard() {
		// TODO Auto-generated method stub
		
	}
}

// Main class with the main method
public class mutli {
    public static void main(String[] args) {
        Three g = new Three();
        g.print_Dell();       // Inherited from One
        g.print_Hard();       // Inherited from Two
        g.print_Learning();   // From Three
    }
}
