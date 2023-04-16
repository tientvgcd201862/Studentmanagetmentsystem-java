package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.ManageModel;
import model.Room;
import model.Student;
import view.ManageView;

public class ManageController implements Action{
	public ManageView view;
	
	
	public ManageController(ManageView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		JOptionPane.showMessageDialog(view, actionCommand);
		if(actionCommand.equals("Add")) {
			this.view.DeleteForm();
			this.view.model.setSelect("Add");
		}else if(actionCommand.equals("Save")) {
			try {
				this.view.AdditionalStudent();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}else if(actionCommand.equals("Update")) {
			this.view.showStudentInformation();
		}else if(actionCommand.equals("Delete")) {
			this.view.deleteStudentInformation();
		}else if(actionCommand.equals("Cancel")) {
			this.view.DeleteForm();
		}else if(actionCommand.equals("Search")) {
			this.view.SearchInformation();
		}else if(actionCommand.equals("Clear")) {
			this.view.ReloadData();
		}else if(actionCommand.equals("About me")) {
			this.view.ShowAbout();
		}else if(actionCommand.equals("Exit")) {
			this.view.Exit();
		}else if(actionCommand.equals("Save File")) {
			this.view.SaveFile();
		}else if(actionCommand.equals("Open")) {
			this.view.OpenFile();
		}
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

}
