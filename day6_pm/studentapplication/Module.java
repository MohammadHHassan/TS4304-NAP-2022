package day6_pm.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student [] students;
	private int currentNumberOfStudents=0;
	
	public Module(String code, String name, int maxNumberOfStudents)
	{
		editCode(code);
		editName(name);
		students = new Student[maxNumberOfStudents];
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student [] getStudents()
	{
		return students;
	}
	
	public void editCode(String code)
	{
		this.code = code;
	}
	
	public void editName(String name)
	{
		this.name = name;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)		// If the module capacity is full
		{
			return false;									// Fail to enroll the student
		}
		
		for(int i=0 ; i<students.length ; i++)				// Using for loop to check the students array one by one
		{
			if(students[i] != null)							// If the student array is not empty
			{
				if(students[i].getId() == student.getId())	// If there is a duplicate student
				{
					return false;							// Fail to enroll the student
				}
			}
		}
		
		students[currentNumberOfStudents] = student;		// Enroll the student in the module
		currentNumberOfStudents++;							// Increment number of students in the module
		return true;										// Successfully enrolled the student in the module
	}
}
