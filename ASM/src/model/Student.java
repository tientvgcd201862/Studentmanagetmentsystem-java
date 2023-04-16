package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student implements Serializable{
	private int studentID;
	private String studentName;
	private String roomNum;
	private Date DoB;
	private boolean Sex;
	private float Maths, English, Literature;
	public Student() {
		
	}
	public Student(int studentID, String studentName, String roomNum, Date doB, boolean sex, float maths, float english,
			float literature) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.roomNum = roomNum;
		DoB = doB;
		Sex = sex;
		Maths = maths;
		English = english;
		Literature = literature;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getDoB() {
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		if (DoB == null) {
			return "";
		}
		return simpleDateFormat.format(DoB);
	}
	public void setDoB(Date doB) {
		DoB = doB;
	}
	public boolean isSex() {
		return Sex;
	}
	public void setSex(boolean sex) {
		Sex = sex;
	}
	public float getMaths() {
		return Maths;
	}
	public void setMaths(float maths) {
		Maths = maths;
	}
	public float getEnglish() {
		return English;
	}
	public void setEnglish(float english) {
		English = english;
	}
	public float getLiterature() {
		return Literature;
	}
	public void setLiterature(float literature) {
		Literature = literature;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", roomNum=" + roomNum + ", DoB="
				+ DoB + ", Sex=" + Sex + ", Maths=" + Maths + ", English=" + English + ", Literature=" + Literature
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(DoB, English, Literature, Maths, Sex, roomNum, studentID, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(DoB, other.DoB) && Float.floatToIntBits(English) == Float.floatToIntBits(other.English)
				&& Float.floatToIntBits(Literature) == Float.floatToIntBits(other.Literature)
				&& Float.floatToIntBits(Maths) == Float.floatToIntBits(other.Maths) && Sex == other.Sex
				&& Objects.equals(roomNum, other.roomNum) && studentID == other.studentID
				&& Objects.equals(studentName, other.studentName);
	}
	
	
}
