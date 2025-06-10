package student;

public class Studentinfo {
	public void Studentinfo() {
		System.out.println("STUDENT DETAILS");
	}
	
	public void display_student (String student, int age, char gender, String address, int contact, String father, String mother) {
		System.out.println("Student Name: " + student);
		System.out.println("Age: " + age);
		System.out.println("Student Address: " + address);
		System.out.println("Contact Number: " + contact);
		System.out.println("Father's Name: " + father);
		System.out.println("Mother's Name is: " + mother);
		System.out.println();
	}
}
