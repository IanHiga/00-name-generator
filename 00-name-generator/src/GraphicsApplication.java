import java.awt.Color;
import java.awt.event.ActionListener;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsApplication extends GraphicsProgram implements ActionListener {
	
	public GraphicsApplication() {
		super();
	}
	
	protected void setMenu() {
		GRect rect = new GRect(100, 100, 100, 100);
		rect.setFillColor(Color.BLACK);
		add(rect);
	}

}
