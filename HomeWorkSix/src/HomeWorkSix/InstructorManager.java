package HomeWorkSix;

public class InstructorManager extends UserManager{
	public void addCourses(String coursename) {
		System.out.println(coursename+" adl� kurs eklenmi�tir");
	}
	public void deleteCourse(String coursename) {
		System.out.println(coursename+"adl� kurs silinmi�tir");
	}
	
	public void showUserInformation(Instructor instructor) {
		System.out.println("Ad:"+instructor.getName()+"Soyad:"+instructor.getSurName());
	}

}
