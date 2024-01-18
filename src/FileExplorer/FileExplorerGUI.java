package FileExplorer;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import java.awt.BorderLayout;

import gui.CMenuBar;

public class FileExplorerGUI {

	private String applicationName = "Connoisseur";
	private JFrame gui_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileExplorerGUI window = new FileExplorerGUI();
					window.gui_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//System.out.println(System.getProperty("user.home")); default user directory
	}

	/**
	 * Create the application.
	 */
	public FileExplorerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Basic application settings
		gui_frame = new JFrame(applicationName);
		gui_frame.setBounds(100, 100, 720, 360);
		gui_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Menu Bar
		CMenuBar menuBar = new CMenuBar();
		gui_frame.setJMenuBar(menuBar);
		
		
	}

}
