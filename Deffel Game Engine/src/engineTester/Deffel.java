package engineTester;

import static engineGraphics.Draw.*;

import engineGraphics.Colors;
import engineGraphics.Window;
import engineInput.Key;

public class Deffel {
	/* 
	 *This is the testing class for the game engine!
	 **/
	
	
	//Setting basic values
	public static int width = 1080, height = 960, rect_x = 500, rect_y = 400;
	
	public static void main(String[] args) {
		//Creating Window
		Window w = new Window(width = 1080, height = 960);
		w.create();
		
		//Main Game Loop
		while(w.isOpen()) {
			
			//Clears Color
			w.clearColor();
			
			//Checks for inputs
			if(Key.isDown(Key.DOWN_ARROW)) rect_y+=2;
			if(Key.isDown(Key.UP_ARROW)) rect_y-=2;
			if(Key.isDown(Key.RIGHT_ARROW)) rect_x+=2;
			if(Key.isDown(Key.LEFT_ARROW)) rect_x-=2;
			
			//Draws Rectangle			
			drawRect(rect_x, rect_y, 50, 50, Colors.blue /*Setting a color, multiple ways to set colors*/);
			
			//Update Window
			w.update(60);
		}
		//Destroy Window
		w.destroy();
	}
}
