package day6_pm.studentapplication;

public class Student
{
	private int id;				// Instance variable
	private String name;		// Instance variable
	private int age;			// Instance variable
	private static int numberOfStudents=0;		// Class variable
	
	public Student(String name, int age)
	{
		this.name = name;		// Store the data from parameter variable name to instance variable name
		editAge(age);			// Store the data from parameter variable age to instance variable age
		numberOfStudents++;		// Increment the numberOfStudents by 1 each time a student object is created
		this.id = numberOfStudents;		// Store the numberOfStudents data in instance variable id
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void editAge(int age)
	{
		this.age = age;
	}
}
