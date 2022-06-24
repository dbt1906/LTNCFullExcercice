package Excercise_19;

import java.util.ArrayList;

public class Student   {
	private String name;
	private String id;
	private Date birthDay;
	private ArrayList<Subject> subjectList;
	public Student(String name, String id, Date birthDay, ArrayList<Subject> subjectList) {
		this.name = name;
		this.id = id;
		this.birthDay = birthDay;
		this.subjectList = subjectList;
	}
	public void addPoint(Subject subject, double point) {
		if(subjectList.contains(subject))
			subject.setPoint(point);
		else {
			subjectList.add(subject);
		}
	}
	public double caculateAveragePoint() {
		int count =0;
		double total=0;
		for (Subject subject : subjectList) {
			total+=subject.getPoint();
			count++;
		}
		return total/count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	@Override
	public String toString() {
		return    id+ "\t"+ name +"\t" + birthDay+"\t"+ this.caculateAveragePoint()+" "+ subjectList;
	}
	
	
	
	
}
