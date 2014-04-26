package lineswingwidget;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	public MainWindow() {  
		// initiate the UI
		InitUI(); 
	}

	/**
	 * initiate UI, it calls the initiation code of the buttons and other widgets/elements
	 */
	private void InitUI() {  
		// set title and other options for the winodows

		setTitle("Hello World");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


}
