import java.io.*;
public class MVCPattern 
{
	public static void main(String v[])
	{
		Student model=retriveStudentFromDatabase();
		StudentView view=new StudentView();
		StudentController controller=new StudentController(model,view);
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();
		
	}
	private static Student retriveStudentFromDatabase()
	{
		Student student=new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}