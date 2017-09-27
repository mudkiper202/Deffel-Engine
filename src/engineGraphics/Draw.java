package engineGraphics;

import static org.lwjgl.opengl.GL11.*;

public class Draw {

	//Draw Rect
	public static void drawRect(int x, int y, int width, int height) {
		glBegin(GL_QUADS);
		glVertex2f(x, y);
		glVertex2f(x, y+height);
		glVertex2f(x+width, y+height);
		glVertex2f(x+width, y);
		glEnd();
		glLoadIdentity();
	}
	
	public static void drawRect(int x, int y, int width, int height, Color color) {
		glBegin(GL_QUADS);
		glColor3f(color.getR(), color.getG(), color.getB());
		glVertex2f(x, y);
		glVertex2f(x, y+height);
		glVertex2f(x+width, y+height);
		glVertex2f(x+width, y);
		glEnd();
		glLoadIdentity();
	}
	
	public static void drawRect(int x, int y, int width, int height, Colors color) {
		glBegin(GL_QUADS);
		glColor3f(color.getR(), color.getG(), color.getB());
		glVertex2f(x, y);
		glVertex2f(x, y+height);
		glVertex2f(x+width, y+height);
		glVertex2f(x+width, y);
		glEnd();
		glLoadIdentity();
	}
	
	public static void drawRect(Rect rect) {
		rect.draw();
	}
}
