package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ManageModel {
	private ArrayList<Student> dsStudent;
	private String Select;
	private String NameFile;
	

	public ManageModel() {
		this.dsStudent = new ArrayList<Student>();
		this.Select = "";
		this.NameFile = "";
	}

	public String getNameFile() {
		return NameFile;
	}

	public void setNameFile(String nameFile) {
		NameFile = nameFile;
	}

	public ManageModel(ArrayList<Student> dsStudent) {
		
		this.dsStudent = dsStudent;
	}

	public ArrayList<Student> getDsStudent() {
		return dsStudent;
	}

	public void setDsStudent(ArrayList<Student> dsStudent) {
		this.dsStudent = dsStudent;
	}
	
	public void insert(Student student) {
		this.dsStudent.add(student);
	}
	public void delete(Student student) {
		this.dsStudent.remove(student);
	}
	public void update(Student student) {
		this.dsStudent.remove(student);
		this.dsStudent.add(student);
	}

	public String getSelect() {
		return Select;
	}

	public void setSelect(String select) {
		Select = select;
	}

	public boolean CheckForExistence(Student st) {
		for(Student student: dsStudent) {
			if(student.getStudentID() == st.getStudentID())
				return true;
		}
		return false;
	}
	
}
