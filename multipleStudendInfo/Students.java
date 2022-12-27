package multipleStudendInfo;

public class Students {
public void getStudentInfo(int studentnum) {System.out.println(studentnum);}
public void getStudentInfo(String studentname) {System.out.println(studentname);}
public void getStudentInfo(String emailId , int phoneNum) {System.out.println(emailId+", "+phoneNum);}
public static void main(String[] args) {
Students obj = new Students();
obj.getStudentInfo(994030);
obj.getStudentInfo("priyadharshan");
obj.getStudentInfo("pd@gamil.com", 4040040);
	
}
}
