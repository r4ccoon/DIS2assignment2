package lineswingwidget;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// create window defined in MainWindow class
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// initiate the object
				MainWindow ex = new MainWindow();
				ex.setVisible(true);
			}
		});
	}

}
