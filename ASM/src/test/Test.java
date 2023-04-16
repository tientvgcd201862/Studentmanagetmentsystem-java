package test;

import javax.swing.UIManager;

import view.ManageView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new ManageView();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
