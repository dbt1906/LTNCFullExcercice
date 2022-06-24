package BaiTap24;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
	private List<Student> studentList;

	/**
	 * @param studentList
	 */
	public QuanLySinhVien(List<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @return the studentList
	 */
	public List<Student> getStudentList() {
		return studentList;
	}

	@Override
	public String toString() {
		return "QuanLySinhVien [studentList=" + studentList + "]";
	}
	public Student findStudent(String id) {
		Student result = null;
		for (Student student : studentList) {
			if(student.getStudentId().equals(id)){
				result =student;
			}
			
	}
		return result;
		}
	public void addSubject(String studentId,String subjectName,String subjectId,double score) {
			Student student = findStudent(studentId);
			if (student!=null) {
				student.addSubject(subjectName, subjectId, score);
			}
			else
				System.out.println("Khong tim thay sinh vien");

	}
	public static void main(String[] args) {
		Subject s1= new Subject("Lap trinh nang cao", "1111", 0);
		Subject s2= new Subject("Ly thuyet do thi", "2222", 0);
		Subject s3= new Subject("Lap trinh co ban", "3333", 0);
		Subject s4= new Subject("Thiet ke huong doi tuong", "9999", 0);
		
		List<Subject> subjectList = new ArrayList<Subject>();
		subjectList.add(s4);
		subjectList.add(s1);
		subjectList.add(s2);
		subjectList.add(s3);
		
		Student student1= new Student("12345", "Du Thanh Minh", subjectList);
		Student student2= new Student("12344", "Du Ban Teo", subjectList);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student2);
		studentList.add(student1);
		
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien(studentList);
		System.out.println(quanLySinhVien.findStudent("12345").toString());
	}
}
