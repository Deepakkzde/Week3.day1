package Week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID= " + id );

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID and Name= " + id + " " + name);

	}
	
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Student Email= &  Phonenumber=" + email + " " + phonenumber);

	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo(12);
		stu.getStudentInfo(1234, "DEEPAK");
		stu.getStudentInfo("deepakkrishnan08@gmail.com", "9790881481");

	}

}