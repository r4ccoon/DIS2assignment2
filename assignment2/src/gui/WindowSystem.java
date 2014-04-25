package gui;
import java.awt.Color;

import de.rwth.hci.Graphics.GraphicsEventSystem;

public class WindowSystem extends GraphicsEventSystem{

	public WindowSystem(int width, int height) {
		super(width, height); 
	}

	@Override
	protected void handlePaint() { 
		Color color = new Color(255, 0, 0); 
		this.setColor(color);

		this.drawLine(0, 0, 1,1);

		this.drawLine(0, 0, 1000,100);
	}
 
}
