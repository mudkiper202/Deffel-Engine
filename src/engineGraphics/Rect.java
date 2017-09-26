package engineGraphics;

import static org.lwjgl.opengl.GL11.*;


public class Rect {

	//Define variables
	private float x, y, width, height;
	private Color color = new Color(Colors.white);
	
	//Constructors
	public Rect(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Rect(float x, float y, float width, float height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Rect(float x, float y, float width, float height, Colors color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = new Color(color);
	}
	
	//Draw method
	public void draw() {
		glBegin(GL_QUADS);
		glColor3f(color.getR(), color.getG(), color.getB());
		glVertex2f(x, y);
		glVertex2f(x, y+height);
		glVertex2f(x+width, y+height);
		glVertex2f(x+width, y);
		glEnd();
		glLoadIdentity();
	}

	//Getters and Setters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
