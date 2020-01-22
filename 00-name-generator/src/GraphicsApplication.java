import java.awt.Color;
import java.awt.event.ActionListener;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsApplication extends GraphicsProgram implements ActionListener {
	
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 800;
	
	public GraphicsApplication() {
		super();
	}
	
	protected void setMenu() {
		GRect rect = new GRect(100, 50, 600, 700);
		GRect button1 = new GRect(150, 350, 500, 50);
		GRect button2 = new GRect(150, 425, 500, 50);
		GRect button3 = new GRect(150, 500, 500, 50);
		GLabel label1 = new GLabel("Random", 150, 375);
		GLabel label2 = new GLabel("Advanced", 150, 450);
		GLabel label3 = new GLabel("Quit", 150, 525);
		
		add(rect);
		add(button1);
		add(button2);
		add(button3);
		add(label1);
		add(label2);
		add(label3);
	}

}
