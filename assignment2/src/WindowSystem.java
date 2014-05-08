import java.awt.Color;
import de.rwth.hci.Graphics.GraphicsEventSystem;

/**
 * the window class
 * 
 * @author rpl
 *
 */
public class WindowSystem extends GraphicsEventSystem{

	int width;
	int height;
	
	public WindowSystem(int width, int height) {
		super(width, height); 
		
		this.width = width;
		this.height = height;
	}
	
	public class SizeType {
		public static final int width = 0;
		public static final int height = 1; 
	} 

	@Override
	protected void handlePaint() { 
		Color color = new Color(255, 0, 0); 
		setColor(color); 
		drawLine(0.2f, 0.3f, 0.8f, 0.7f); 
	}
	
	private int convert(int sizeType, float size){
		switch (sizeType){
			case SizeType.height:
				return  (int)(size * height);
			
			case SizeType.width: 
				return (int)(size * width);
		}
		
		return 0;
	}
	
	/**
	 * 
	 * @param originX
	 * @param originY
	 * @param destinationX
	 * @param destinationY
	 */
	protected void drawLine(float originX, float originY, float destinationX, float destinationY){
		int origX = convert(SizeType.width, originX);
		int origY = convert(SizeType.height, originY);
		
		int destX = convert(SizeType.width, destinationX);
		int destY = convert(SizeType.height, destinationY);
		
		this.drawLine(origX, origY, destX, destY);
	}
 
}
