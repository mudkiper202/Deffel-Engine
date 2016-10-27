package engineGraphics;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Window {

	private String title = "Deffel Engine";
	private int width, height;
	private boolean resizable = false;
	
	public Window(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	public Window(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void create() {
		Display.setTitle(title);
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.setResizable(resizable);
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, width, height, 0 , 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
		
	}
	
	public void update(int fps) {		
		Display.update();
		Display.sync(fps);
	}
	
	public void destroy() {
		Display.destroy();
	}
	
	public void clearColor() {
		glClear(GL_COLOR_BUFFER_BIT);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isOpen() {
		if(!Display.isCloseRequested()){
			return true;
		}
		return false;
	}

	public boolean isResizable() {
		return resizable;
	}

	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}
}
