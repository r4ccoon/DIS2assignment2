package lineswingwidget;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class LineWidget extends JComponent implements MouseListener, MouseMotionListener {

	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 747922047911692215L;
	
	Vector2 start;
	Vector2 end; 
 	
	boolean inDrag = false;
	
	public Vector2 getStartingPoint() {
		return start;
	}
 
	public void setStartingPoint(Vector2 startingPoint) {
		this.start = startingPoint;
	}
 
	public Vector2 getEndPoint() {
		return end;
	}
  
	public void setEndPoint(Vector2 endPoint) {
		this.end = endPoint;
	}
  
	public LineWidget(){
		addMouseListener(this);
		addMouseMotionListener(this); 
		
		start = new Vector2();
		end = new Vector2();
	} 

	@Override
	public void mouseReleased(MouseEvent e) {   
		end.setX(e.getX());
		end.setY(e.getY()); 
		
		inDrag = false; 
		repaint();
	}
	  
	@Override
	public void mouseDragged(MouseEvent e) {
		if (inDrag) {  
			end.setX(e.getX());
			end.setY(e.getY()); 
			
			repaint();
		} 
	}

	@Override
	public void mousePressed(MouseEvent e) {  
	    inDrag = true;

		start.setX(e.getX());
		start.setY(e.getY()); 
		
		repaint();
	}
	
	public  void paintComponent (Graphics g) {  
        g.drawLine(start.getX(), start.getY(), end.getX(), end.getY());
	}
 
	@Override
	public void mouseMoved(MouseEvent arg0) { 
	}
	
	@Override
	public void mouseEntered(MouseEvent e) { 
	}

	@Override
	public void mouseExited(MouseEvent e) { 
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {  
	}


	void log(String eventDescription, MouseEvent e) {
        System.out.println(eventDescription);
    }
}
