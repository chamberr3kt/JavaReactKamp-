package HomeWorkSix;

public class StudentManager {

	public void joinCourse(String coursename) {
		System.out.println(coursename+" adl� kursa kat�lm��t�r");
	}
	public void deleteCourse(String coursename) {
		System.out.println(coursename+" adl� kurs silinmi�tir");
	}
	public void showUserInformation(Student student) {
		System.out.println("Ad:"+student.getName()+"Soyad:"+student.getSurName());
	}

}
