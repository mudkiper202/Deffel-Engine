package engine;

import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import engineGraphics.Window;

public class DeffelEngine {

	private Window window;
	
	public DeffelEngine(Window window) {
		this.window = window;
	}	
	
	public void startUp() {
		Display.setTitle(window.getTitle());
		try {
			Display.setDisplayMode(new DisplayMode(window.getWidth(), window.getHeight()));
			Display.setResizable(window.isResizable());
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, window.getWidth(), window.getHeight(), 0 , 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}
	
	public boolean isRunning() {
		return window.isOpen();
	}
	
	public void update(int fps) {
		Display.update();
		Display.sync(fps);
	}
	
	public void end() {
		window.destroy();
	}
	
	public void allowTextures() {
		GL11.glEnable(GL11.GL_TEXTURE_2D);
	}
	
}
