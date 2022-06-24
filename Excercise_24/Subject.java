package BaiTap24;

public class Subject {
	private String subjectName;
	private String subjectId;
	private double subjectScore;
	/**
	 * @param subjectName
	 * @param subjectId
	 * @param subjectScore
	 */
	public Subject(String subjectName, String subjectId, double subjectScore) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.subjectScore = subjectScore;
	}
	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}
	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	/**
	 * @return the subjectId
	 */
	public String getSubjectId() {
		return subjectId;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * @return the subjectScore
	 */
	public double getSubjectScore() {
		return subjectScore;
	}
	/**
	 * @param subjectScore the subjectScore to set
	 */
	public void setSubjectScore(double subjectScore) {
		this.subjectScore = subjectScore;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", subjectId=" + subjectId + ", subjectScore=" + subjectScore
				+ "]";
	}
	
}
