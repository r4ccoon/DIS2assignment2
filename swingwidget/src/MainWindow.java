import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame  
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 

	private JPanel panel;
	private LineWidget linie; 

	public MainWindow() {   
		// initiate the UI
		InitUI(); 
	}

	/**
	 * initiate UI, it calls the initiation code of the buttons and other widgets/elements
	 */
	private void InitUI() {   
		panel = new JPanel();
		linie = new LineWidget();
		
		getContentPane().add(panel); 
		panel.setLayout(new GridLayout(1,1));
		 
		panel.add(linie);
		
		// set title and other options for the winodows
		setTitle("please click and drag the mouse to form a line. release to finalize the line.");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	
}
