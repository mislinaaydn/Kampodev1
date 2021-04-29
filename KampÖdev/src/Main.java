
public class Main {

	public static void main(String[] args) {
		 Student student1 = new Student(1,"Mislina Aydın");
		 Student student2 = new Student(1,"Elif Aydın");
		 
	     
	        Course course1 = new Course(1,"Java Kampı","Engin demiroğ");
	        Course course2 = new Course(2,"C# Kampı","Engin demiroğ");
	        
	        
	        CourseManager courseManager = new CourseManager();
	        courseManager.addCourse(course1);
	        courseManager.deletedCourse(course2);
	        courseManager.updatedCourse(course2);
	        
	        StudentManager studentManager = new StudentManager();
	        studentManager.login(student1);
	        studentManager.register(student2, course2);
	}

}
