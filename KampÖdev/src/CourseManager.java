
public class CourseManager {
	public void addCourse(Course course) {
		System.out.println(course.name + "Yeni kurs eklendi");

	}
	public void deletedCourse(Course course) {
		System.out.println(course.name + "Kurs silindi");

	}
	public void updatedCourse(Course course) {
		System.out.println(course.name + "Kurs güncellendi");

	}
}
