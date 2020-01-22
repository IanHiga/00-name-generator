import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;

import acm.graphics.GRect;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;

public class MainApplication extends GraphicsApplication {
	public static final String FILE_DIRECTORY = "data/";
	public static final String FILE_EXTENSION = ".txt";
	public static final String SYLLABLE_FILE = "syllables";
	
	
	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		setMenu();
		int choice = 0;
		System.out.println("Welcome to the name generator!\n");
		System.out.println("Choose an option:\n1) Generate a random name!\n2) Generate a name of a specific length!\n3) Exit");
		try {
			choice = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch(choice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}

}
