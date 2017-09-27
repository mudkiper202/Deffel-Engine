package engineTester;

import engine.DeffelEngine;
import engineGraphics.Color;
import engineGraphics.Draw;
import engineGraphics.Window;

public class Deffel {
	
	/* 
	 *This is the testing class for the game engine!
	 **/
	
	//Setting basic values
	public static final int WIDTH = 800, HEIGHT = 800;
	
	public static void main(String[] args) {
		Window w = new Window(WIDTH, HEIGHT);
		DeffelEngine engine = new DeffelEngine(w);
		
		engine.startUp();
		
		while(engine.isRunning()) {
			//Do Stuff
			w.clearColor();
			
			Draw.drawRect(80 ,80 ,80 ,80, new Color(1, 1, 0));
			
			engine.update(60);
		}
		
		engine.end();
	}
}
