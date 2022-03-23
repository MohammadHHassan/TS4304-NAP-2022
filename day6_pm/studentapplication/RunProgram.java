package day6_pm.studentapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Module module1 = new Module("TS4304", "Network Application Programming", 3);	// Creating module1 object
		Student student1 = new Student("Mohammad", 18);			// Creating student1 object
		Student student2 = new Student("Bin", 19);				// Creating student2 object
		Student student3 = new Student("Haji", 20);				// Creating student3 object
		Student student4 = new Student("Hassan", 21);			// Creating student4 object
		
		System.out.println("Module: " + module1.getCode() + " " + module1.getName());	// Displaying module code and name
		
		printAddingStudent(module1, student1);					// Enroll student1 into module1
		printAddingStudent(module1, student2);					// Enroll student2 into module1
		printAddingStudent(module1, student3);					// Enroll student3 into module1
		printAddingStudent(module1, student4);					// Enroll student4 into module1
	}
	
	public static void printAddingStudent(Module module, Student student)	// Method used to enroll student in the module
	{
		System.out.println("Adding student: " + student.getId() + ". " + student.getName());	// Display the id and name of the student
		System.out.println("Successful? " + module.addStudent(student));	// Display successful/fail enrollment
	}
}
