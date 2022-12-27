package org.student;
import org.department.Department;
public class Student extends Department {
public void studentName(){System.out.println("Name = priyadharshan");}	
public void studentDept(){System.out.println("Dept =  Auto");}	
public void studentId(){System.out.println("Id = Pd1006");}
public static void main(String[] args) {
	Student obj = new Student();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.department();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
}
}
