package assignment2;

public class Main {
	public static void main(String[] args) {
        // Create Student object (default constructor prints message)
        Student s1 = new Student();

        // Create Commission object and test methods
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }

}
