package gui;

import java.util.LinkedList;
import java.util.List;

/**
 * factory class for managing windows
 * @author rpl
 *
 */
public class WindowManager {
	List<WindowSystem> windows;
	
	public WindowManager(){
		windows = new LinkedList<WindowSystem>();
	}
	 
	public WindowSystem CreateWindow(String title, int width, int height){
		WindowSystem win = new WindowSystem(width, height);
		
		// add to the stacks
		windows.add(win);
		
		return win;
	}
	
	/**
	 * remove window from the stack
	 * @param win
	 */
	public void RemoveWindow(WindowSystem win){
		windows.remove(win);
	}
	
}
