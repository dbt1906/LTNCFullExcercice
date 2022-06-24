package Excercise_19;

public class Subject {
	private String name;
	private String key;
	private double point;
	public Subject(String name, String key, double point) {
		this.name = name;
		this.key = key;
		this.point = point;
	}
	@Override
	public String toString() {
		return "Subject Name=" + name + ", Subject Key=" + key + ", Point=" + point + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
}
