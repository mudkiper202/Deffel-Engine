package engineGraphics;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;

public class Window {

	//Defining variables
	private String title = "Deffel Engine";
	private int width, height;
	private boolean resizable = false;
	
	//Constructors
	public Window(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	public Window(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//Destroy Method
	public void destroy() {
		Display.destroy();
	}
	
	//Clears color Method
	public void clearColor() {
		glClear(GL_COLOR_BUFFER_BIT);
	}
	
	//Getters and Setters
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
