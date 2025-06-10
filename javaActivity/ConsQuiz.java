package src.javaActivity;
import java.text.*;
import java.util.*;
public class ConsQuiz
	{
	public static void main(String[] args)
	{
		DecimalFormat df=new DecimalFormat("###.00");
		Student stud1 = new Student( "Marcus", "Laureta", 85, 87, 82 );

		System.out.println("Hello " + stud1.getLastName() + ", " + stud1.getFirstName() + " your grade is " + df.format(stud1.getAverage()));

		stud1.setExam1(95);
		stud1.setExam2(97);
		stud1.setExam3(92);

		System.out.printf( "%s %s's new grade is %.2f", stud1.getFirstName(), stud1.getLastName(), stud1.getAverage());
	}
}

	class Student
	{
		private String firstName;
		private String lastName;
		private double exam1;
		private double exam2;
		private double exam3;

		public Student(String firstName, String last, double exam1, double exam2, double exam3) {
			this.firstName = firstName;
			this.lastName = last;
			this.exam1 = exam1;
			this.exam2 = exam2;
			this.exam3 = exam3;
		}
		public String getFirstName()
		{
			return firstName;
		}
		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		public String getLastName()
		{
			return lastName;
		}
		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		public double getExam1()
		{
			return exam1;
		}
		public void setExam1(double exam1)
		{
			this.exam1 = exam1;
		}
		public double getExam2()
		{
			return exam2;
		}
		public void setExam2(double exam2)
		{
			this.exam2 = exam2;
		}
		public double getExam3()
		{
			return exam3;
		}
		public void setExam3(double exam3)
		{
			this.exam3 = exam3;
		}
		public double getAverage()
		{
			return (exam1 + exam2 + exam3) / 3;
		}
}