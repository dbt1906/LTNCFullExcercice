package BaiTap24;

import java.util.List;

public class Student {
	private String studentId;
	private String studentName;
	private List<Subject> studentSubject;
	/**
	 * @param studentId
	 * @param studentName
	 * @param studentSubject
	 */
	public Student(String studentId, String studentName, List<Subject> studentSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSubject = studentSubject;
	}
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentSubject
	 */
	public List<Subject> getStudentSubject() {
		return studentSubject;
	}
	/**
	 * @param studentSubject the studentSubject to set
	 */
	public void setStudentSubject(List<Subject> studentSubject) {
		this.studentSubject = studentSubject;
	}
	public void setScore(String subjectName,double newScore) {
		for (Subject subject : studentSubject) {
			if(subject.getSubjectName().equals(subjectName)) {
				subject.setSubjectScore(newScore);
			}
		}
	}
	@Override
	public String toString() {
		String result = "STT\t"+"Ten mon hoc"+"\t \t \t \t"+"Diem \n";
		int count = 1;
		for(Subject subject :this.getStudentSubject()) {
			result+=count+"\t"+subject.getSubjectName()+"\t\t\t"+subject.getSubjectScore()+"\n";
			count++;
		}
		return result;
	}
	public void addSubject(String subjectName, String subjectId, double socre) {
		Subject subject = new Subject(subjectName, subjectId, socre);
		this.studentSubject.add(subject);
	}
}
