package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;

public class CMenuBar extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	public CMenuBar() {
		this.addContent();
	}
	
	private void addContent() {
		// file menu
		this.initFileMenu();
		this.initFileMenu();
		this.initHelpMenu();
	}
	
	private void initFileMenu() {
		
	}

	private void initEditMenu() {
		
	}
	
	private void initHelpMenu() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
