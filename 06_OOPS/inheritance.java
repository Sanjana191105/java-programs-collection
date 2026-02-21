package JAVA;
class Person {
    String name;
    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int marks;
    void displayMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class inheritance {
	public static void main(String[] args) {
		Student s = new Student();
        s.name = "Sanj";
        s.marks = 90;
        s.displayName();
        s.displayMarks();
		

	}

}
