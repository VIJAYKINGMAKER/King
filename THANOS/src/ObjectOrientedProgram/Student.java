package ObjectOrientedProgram;

// Abstract base class
abstract class Person1 {
    protected String name;
    protected String gender;

    public Person1(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // Abstract method to be overridden
    public abstract  void Studying();
}

// Abstract class Student extending Person
abstract class Student extends Person1 {
    protected int studentID;

    public Student(String name, String gender, int studentID) {
        super(name, gender);
        this.studentID = studentID;
    }

    @Override
    public void Studying() {
        if (studentID == 0) {
            System.out.println(name + " (" + gender + ") - Not Studying");
        } else {
            System.out.println(name + " (" + gender + ") - Pursuing the Degree");
        }
    }
}

// Concrete subclasses of Student
class Student1 extends Student {
    public Student1(String name, String gender, int id) {
        super(name, gender, id);
    }
}

class Student2 extends Student {
    public Student2(String name, String gender, int id) {
        super(name, gender, id);
    }
}

class Student3 extends Student {
    public Student3(String name, String gender, int id) {
        super(name, gender, id);
    }
}

class Student4 extends Student {
    public Student4(String name, String gender, int id) {
        super(name, gender, id);
    }

// ✅ Separate Main class to run the application
    public static void main(String[] args) {
        // Array of Person1 references pointing to Student objects
        Person1[] students = {
            new Student1("Uma", "Female", 0),
            new Student2("Kala", "Female", 1245),
            new Student3("Vijay", "Male", 9875),
            new Student4("Mouni", "Female", 4578),
            new Student4("DP Rao", "Male", 5645)
        };

        // Call Studying() on each student
        for (Person1 s : students) {
            s.Studying();
        }
    }
}
