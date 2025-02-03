//StuentOperations.java
import java.util.*;
class StudentOperations{
	ArrayList<Student> students; //arraylist created with the class Student as the data type as student has multiple data types
	
	public StudentOperations(){
		this.students = new ArrayList<>();
	}
	// here 'Student' is the datatype, 'students' is the araylist and 'student' is the new entry.
	public void addStudents(Student student){
		students.add(student);
		System.out.println("Student added.");
	}
}
