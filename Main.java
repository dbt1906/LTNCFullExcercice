package Excercise_19;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Date date1= new Date(19,6,2003);
		Date date2= new Date(19,9,2003);
		Subject subject1= new Subject("Lap trinh nang cao mon 1", "LTNCDH21", 10);
		Subject subject2= new Subject("Toan A3", "TA3DH21", 10);
		Subject subject3= new Subject("Lap trinh nang cao", "LTNCDH21", 9);
		Subject subject4= new Subject("Toan A3", "TA3DH21", 20);
		ArrayList<Subject> subjectList1 = new ArrayList<Subject>();
		subjectList1.add(subject1);
		subjectList1.add(subject2);
		ArrayList<Subject> subjectList2 = new ArrayList<Subject>();
		subjectList2.add(subject3);
		subjectList2.add(subject4);
		Student student1=new Student("Du Thanh Minh", "21130444", date1, subjectList1);
		Student student2=new Student("Le Minh Quan", "21130445", date2, subjectList2);
		Student student3=new Student("Le Minh Quan", "21130446", date2, subjectList1);
		ArrayList<Student> studentList= new ArrayList<Student>();
		StudentManagement studentManagement= new StudentManagement(studentList);
		studentManagement.addStudent(student1);
		studentManagement.addStudent(student2);
		studentManagement.addStudent(student3);
		studentManagement.addPoint(student2, subject1, 8);
		studentManagement.print();
		System.out.println("Average point of "+student2.getName()+" "+student2.caculateAveragePoint());
		System.out.println("Average point of "+student1.getName()+" "+student1.caculateAveragePoint());
		System.out.println(studentManagement.findStudent("Du Thanh Minh", "21130444").toString());
		studentManagement.printNameSort();
		studentManagement.printPointSort();
		studentManagement.printSort();
		
	}
}
