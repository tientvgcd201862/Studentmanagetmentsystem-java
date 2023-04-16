package view;

import java.awt.EventQueue;
 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ManageModel;
import model.Room;
import model.Student;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import java.awt.Component;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ButtonGroup;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controller.ManageController;

import javax.swing.JCheckBox;
import javax.swing.JSplitPane;




public class ManageView extends JFrame {
	public ManageModel model;
	public JTextField TextFilter;
	public JTable table;
	public JTextField StudentIDInfor;
	public JTextField NameInfor;
	public JTextField DoBInfor;
	public JTextField MathInfor;
	public JTextField EnglishInfor;
	public JTextField LiteratureInfor;
	public JTextField RoomInfor;
	public ButtonGroup btn_Sex;
	private JCheckBox MaleCheckBox;
	private JCheckBox FemaleCheckBox;
	private JButton btnSearch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageView frame = new ManageView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageView() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.model = new ManageModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1002, 760);
		
		Action action = new ManageController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(action);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save File");
		menuSave.addActionListener(action);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.addActionListener(action);
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutme = new JMenuItem("About me");
		menuAboutme.addActionListener(action);
		menuAboutme.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuAbout.add(menuAboutme);
		getContentPane().setLayout(null);
		
		TextFilter = new JTextField();
		TextFilter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		TextFilter.setColumns(10);
		TextFilter.setBounds(194, 43, 511, 36);
		getContentPane().add(TextFilter);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(action);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBackground(new Color(192, 192, 192));
		btnSearch.setForeground(new Color(0, 0, 0));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSearch.setBounds(718, 41, 123, 36);
		getContentPane().add(btnSearch);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(66, 21, 912, 2);
		getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Filter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(11, 10, 45, 28);
		getContentPane().add(lblNewLabel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 97, 968, 2);
		getContentPane().add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("List Of Students");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(11, 109, 123, 36);
		getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"StudentID", "Name", "Room", "DoB", "Sex", "Math", "English", "Literature"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(11, 144, 967, 221);
		getContentPane().add(scrollPane);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(11, 403, 968, 2);
		getContentPane().add(separator_2_1);
		
		JLabel lable_StudentID_1 = new JLabel("StudentID");
		lable_StudentID_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_StudentID_1.setBounds(11, 435, 90, 56);
		getContentPane().add(lable_StudentID_1);
		
		StudentIDInfor = new JTextField();
		StudentIDInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		StudentIDInfor.setColumns(10);
		StudentIDInfor.setBounds(104, 447, 227, 36);
		getContentPane().add(StudentIDInfor);
		
		JLabel lable_Name = new JLabel("Name");
		lable_Name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_Name.setBounds(11, 493, 90, 56);
		getContentPane().add(lable_Name);
		
		NameInfor = new JTextField();
		NameInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		NameInfor.setColumns(10);
		NameInfor.setBounds(104, 505, 227, 36);
		getContentPane().add(NameInfor);
		
		JLabel lable_Room = new JLabel("Room");
		lable_Room.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_Room.setBounds(11, 551, 90, 56);
		getContentPane().add(lable_Room);
		
		JLabel lable_DoB = new JLabel("DoB");
		lable_DoB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_DoB.setBounds(11, 603, 90, 56);
		getContentPane().add(lable_DoB);
		
		DoBInfor = new JTextField();
		DoBInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		DoBInfor.setColumns(10);
		DoBInfor.setBounds(104, 615, 227, 36);
		getContentPane().add(DoBInfor);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student Information");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(11, 403, 188, 36);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lable_Sex = new JLabel("Sex");
		lable_Sex.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_Sex.setBounds(385, 435, 90, 56);
		getContentPane().add(lable_Sex);
		
		MaleCheckBox = new JCheckBox("Male");
		MaleCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		MaleCheckBox.setBounds(441, 455, 93, 21);
		getContentPane().add(MaleCheckBox);
		
		FemaleCheckBox = new JCheckBox("Female");
		FemaleCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FemaleCheckBox.setBounds(550, 455, 93, 21);
		getContentPane().add(FemaleCheckBox);
		
		btn_Sex = new ButtonGroup();
		btn_Sex.add(MaleCheckBox);
		btn_Sex.add(FemaleCheckBox);
		
		JLabel lable_Math = new JLabel("Math");
		lable_Math.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_Math.setBounds(385, 493, 90, 56);
		getContentPane().add(lable_Math);
		
		MathInfor = new JTextField();
		MathInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		MathInfor.setColumns(10);
		MathInfor.setBounds(478, 505, 154, 36);
		getContentPane().add(MathInfor);
		
		EnglishInfor = new JTextField();
		EnglishInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		EnglishInfor.setColumns(10);
		EnglishInfor.setBounds(478, 563, 154, 36);
		getContentPane().add(EnglishInfor);
		
		JLabel lable_English = new JLabel("English");
		lable_English.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_English.setBounds(385, 551, 90, 56);
		getContentPane().add(lable_English);
		
		LiteratureInfor = new JTextField();
		LiteratureInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		LiteratureInfor.setColumns(10);
		LiteratureInfor.setBounds(478, 615, 154, 36);
		getContentPane().add(LiteratureInfor);
		
		JLabel lable_Literature = new JLabel("Literature");
		lable_Literature.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lable_Literature.setBounds(385, 603, 90, 56);
		getContentPane().add(lable_Literature);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(action);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBackground(new Color(128, 128, 128));
		btnAdd.setBounds(698, 466, 123, 36);
		getContentPane().add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(action);
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.setBounds(838, 466, 123, 36);
		getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(action);
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setBounds(698, 533, 123, 36);
		getContentPane().add(btnDelete);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(action);
		btnSave.setForeground(Color.BLACK);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSave.setBackground(Color.LIGHT_GRAY);
		btnSave.setBounds(838, 533, 123, 36);
		getContentPane().add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(action);
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(775, 602, 123, 36);
		getContentPane().add(btnCancel);
		
		RoomInfor = new JTextField();
		RoomInfor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RoomInfor.setColumns(10);
		RoomInfor.setBounds(104, 557, 227, 36);
		getContentPane().add(RoomInfor);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(action);
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(851, 41, 110, 36);
		getContentPane().add(btnClear);
		
		JLabel lblSearchById = new JLabel("Search By ID");
		lblSearchById.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSearchById.setBounds(74, 45, 110, 28);
		getContentPane().add(lblSearchById);
		
		
		
		this.setVisible(true);
		
		
	}

	public void DeleteForm() {
		TextFilter.setText("");
		StudentIDInfor.setText("");
		NameInfor.setText("");
		RoomInfor.setText("");
		DoBInfor.setText("");
		MathInfor.setText("");
		EnglishInfor.setText("");
		LiteratureInfor.setText("");
		btn_Sex.clearSelection();
	}
	public void AddStudentInTable(Student st) {
		DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
		model_tb.addRow(new Object[] {
				st.getStudentID()+"",
				st.getStudentName()+"",
				st.getRoomNum()+"",
				st.getDoB()+"", 	
				(st.isSex()?"Male":"Female"),
				st.getMaths()+"",
				st.getEnglish()+"",
				st.getLiterature()+"",
				});
	}
	public void AddAndUpdateStudent(Student st) {
		DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
		if(!this.model.CheckForExistence(st)) {
		this.model.insert(st);
		this.AddStudentInTable(st);
			}else {
				this.model.update(st);
				int NumRow = model_tb.getRowCount();
				for(int i= 0; i < NumRow; i++) {
					String id = model_tb.getValueAt(i, 0)+"";
					if(id.equals(st.getStudentID()+"")) {
						model_tb.setValueAt(st.getStudentID()+"",i,0);
						model_tb.setValueAt(st.getStudentName()+"",i,1);
						model_tb.setValueAt(st.getRoomNum()+"",i,2);
						model_tb.setValueAt(st.getDoB()+"",i,3);
						model_tb.setValueAt((st.isSex()? "Male" : "Female"),i,4);
						model_tb.setValueAt(st.getMaths()+"",i,5);
						model_tb.setValueAt(st.getEnglish()+"",i,6);
						model_tb.setValueAt(st.getLiterature()+"",i,7);
					}
				}
			}
		}
		

	
	public Student getChooseStudent() {
		DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		model_tb.getValueAt(i_row, 0);
		
		int studentID = Integer.valueOf(model_tb.getValueAt(i_row, 0)+"");
		String studentName = model_tb.getValueAt(i_row, 1)+"";
		String roomNum = model_tb.getValueAt(i_row, 2)+"";
		String s_DoB = model_tb.getValueAt(i_row, 3)+"";
		Date DoB = new Date(s_DoB);
		String textSex = model_tb.getValueAt(i_row, 4)+"";
		boolean Sex = textSex.equals("Male");
		
		float Math = Float.valueOf(model_tb.getValueAt(i_row, 5)+"");
		float English = Float.valueOf(model_tb.getValueAt(i_row, 6)+"");
		float Literature = Float.valueOf(model_tb.getValueAt(i_row, 7)+"");
		
		Student st = new Student(studentID, studentName, roomNum, DoB, Sex, Math, English, Literature);
		return st;
	}
	public void showStudentInformation() {
		
		
		Student st = getChooseStudent();
		this.StudentIDInfor.setText(st.getStudentID()+"");
		this.NameInfor.setText(st.getStudentName()+"");
		this.RoomInfor.setText(st.getRoomNum()+"");
		this.DoBInfor.setText(st.getDoB()+"");
		
		if(st.isSex()) {
			MaleCheckBox.setSelected(true);
		}else {
			FemaleCheckBox.setSelected(true);
		}
		
		this.MathInfor.setText(st.getMaths()+"");
		this.EnglishInfor.setText(st.getEnglish()+"");
		this.LiteratureInfor.setText(st.getLiterature()+"");
	}

	public void deleteStudentInformation() {
		DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int Choose = JOptionPane.showConfirmDialog(this, "Are you sure to delete the selected line?");
		if(Choose==JOptionPane.YES_OPTION) {
			Student st = getChooseStudent();
			this.model.delete(st);
			model_tb.removeRow(i_row);
		}
	}

	public void AdditionalStudent() {
		int studentID = Integer.valueOf(this.StudentIDInfor.getText());
		String studentName = this.NameInfor.getText();
		String roomNum = this.RoomInfor.getText();
		Date DoB = new Date(this.DoBInfor.getText());
		boolean Sex = true;
		if(this.MaleCheckBox.isSelected()) {
			Sex = true;
		}else if(this.FemaleCheckBox.isSelected()) {
			Sex = false;
		}
		float Math = 0;
		try {
				Math = Float.valueOf(this.MathInfor.getText());
			if(Math < 0 ) {
				JOptionPane.showInternalMessageDialog(null, "Point must be greater than 0");
				return;
			}
		}catch(NumberFormatException e){
			JOptionPane.showInternalMessageDialog(null, "Points must be numbers");
		}
		float English = 0;
		try {
			English = Float.valueOf(this.EnglishInfor.getText());
			if(English < 0) {
				JOptionPane.showInternalMessageDialog(null, "Point must be greater than 0");
				return;
			}
		}catch(NumberFormatException e){
			JOptionPane.showInternalMessageDialog(null, "Points must be numbers");
		}
		float Literature = 0;
		try {
			Literature = Float.valueOf(this.LiteratureInfor.getText());
			if(Literature < 0) {
				JOptionPane.showInternalMessageDialog(null, "Point must be greater than 0");
				return;
			}
		}catch(NumberFormatException e){
			JOptionPane.showInternalMessageDialog(null, "Points must be numbers");
		}
		Student st = new Student(studentID, studentName, roomNum, DoB, Sex, Math, English, Literature);
		this.AddAndUpdateStudent(st);
	}
	public void SearchInformation() {
		// outer go to Statement
		this.ReloadData();
		outer: if (TextFilter.getText().length() == 0) {
			
			TextFilter.requestFocus();
			break outer;
		} else {
			String search = TextFilter.getText();
			RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter(search, 0);
			DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
			TableRowSorter sort = new TableRowSorter<>(model_tb);
			sort.setRowFilter(rf);
			table.setRowSorter(sort);
		}
	}


	public void ReloadData() {
		while(true) {
		DefaultTableModel model_tb = (DefaultTableModel) table.getModel();
		TableRowSorter sort = new TableRowSorter<>(model_tb);
		
		table.setRowSorter(sort);
		int NumRow = model_tb.getRowCount();
		if(NumRow==0) 
			break;
		else
			try {
				model_tb.removeRow(0);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		for ( Student st : this.model.getDsStudent()) {
			this.AddStudentInTable(st);
		}
	}

	public void ShowAbout() {
		JOptionPane.showMessageDialog(this, "Manage Student");
	}

	public void Exit() {
		int Choose = JOptionPane.showConfirmDialog(
			    this,
			    "Do you want to exit the program?",
			    "Exit",
			    JOptionPane.YES_NO_OPTION);
		if (Choose == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	public void saveFile(String path) {
		try {
			this.model.setNameFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Student st : this.model.getDsStudent()) {
				oos.writeObject(st);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void SaveFile() {
		if(this.model.getNameFile().length()>0) {
			saveFile(this.model.getNameFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
	}
	
	public void openFile(File file) {
		ArrayList<Student> ds = new ArrayList<Student>();
		try {
			this.model.setNameFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student st = null;
			while((st = (Student) ois.readObject())!=null) {
				ds.add(st);
			}
			ois.close();
		} catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, "File opened successfully");
		}
		this.model.setDsStudent(ds);
	}
	public void OpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			ReloadData();
		}
	}
}
