
public class StudentManager {
	public void login(Student student) {
		System.out.println(student.name + " Giriş yaptı.");

	}

	public void register(Student student, Course course) {
		System.out.println(student.name + " adlı öğrenci" + " " + course.name + "  kursuna kayıt oldu.");
	}
}

