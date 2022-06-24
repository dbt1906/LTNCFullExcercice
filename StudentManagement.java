package Excercise_19;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentManagement {
	private   ArrayList<Student> studentList;

	
	public StudentManagement(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public void addStudent(Student student) {
		studentList.add( student);
	}
	public void addPoint(Student student,Subject subject ,double point) {
		student.addPoint(subject, point);
	}
	
	public  void print() {
		System.out.println("Id\t\tName\t\tBirth day\t\t\tSubject list");
		try {
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Student findStudent(String name, String id) {
		for (Student student : studentList) {
			if (student.getName().equals(name)&&student.getId().equals(id)) {
				return student;
			}
			else {
				System.out.println("Khong tim thay sinh vien");
				return null;
		}
	}
		return null;}
	public void printNameSort() {
		System.out.println("Print name with point sorted::");
		Collections.sort(this.studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}});
			
		try {
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
	public void printPointSort() {
		System.out.println("Print students with point sorted::");
		Collections.sort(this.studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if ( o1.caculateAveragePoint()<o2.caculateAveragePoint())
					return 1;
				else {
					if (o1.caculateAveragePoint()==o2.caculateAveragePoint())
						return 0;
					else 
						return -1;
				}
			}});
			
		try {
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void printSort() {
		System.out.println("Print name with sorted::");
		Collections.sort(this.studentList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getName().compareTo(o2.getName())==0) {
					if(o1.caculateAveragePoint()<o2.caculateAveragePoint())
						return 1;
					else if (o1.caculateAveragePoint()>o2.caculateAveragePoint())
						return -1;
					else return 0;
				}
				else
					return o1.getName().compareTo(o2.getName());
						
			}});
			
		try {
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
	}