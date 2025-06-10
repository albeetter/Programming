package student;
import java.text.*;
public class Acadinfo {
	
	int q1, q2, mid, finals, average;
	public void Acadinfo() {
		System.out.println("STUDENT EDUCATIONAL DETAILS");
	}
	
	public void displayEducDetails(int studnum, int q1, int q2, int mid, int finals, int attendance) {
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println("Student Number: " + studnum);
		average = (q1+q2+mid+finals)/4;
		System.out.println("Student Grade Average: " + df.format(average));
		System.out.println("Student Attendance: " + attendance + "%");
	}
}
