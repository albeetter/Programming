package main;
import employee.Employeeinfo;
import student.Acadinfo;
import student.Studentinfo;
public class MainProgram {

	public static void main(String[] args) {
		
		Studentinfo student1 = new Studentinfo();
		Employeeinfo employee1 = new Employeeinfo();
		Acadinfo info1 = new Acadinfo();
		Studentinfo student2 = new Studentinfo();
		Employeeinfo employee2 = new Employeeinfo();
		Acadinfo info2 = new Acadinfo();
		
		student1.Studentinfo();
		student1.display_student("Jordi Polla", 25, 'M', "Iran", 9320756, "Mr. James Bond", "Mrs. Vice Ganda");
		employee1.display_Employee("Audrey Lyle", "Faculty", "Professor");
		info1.Acadinfo();
		info1.displayEducDetails(2468, 90, 90, 100, 100, 100);
		
		System.out.println("\nNEXT STUDENT\n");
		
		student2.Studentinfo();
		student2.display_student("Hope Elizabeth", 28, 'F', "Iraq", 9320756, "Mr. Bong Go", "Mrs. Gal Gadot");
		employee2.display_Employee("Bryan Salar", "Faculty", "Professor");
		info2.Acadinfo();
		info2.displayEducDetails(13579, 80, 80, 85, 90, 98);

	}
}
