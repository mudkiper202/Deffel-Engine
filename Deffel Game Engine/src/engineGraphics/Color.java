package engineGraphics;

public class Color {

	private float r, g, b;
	
	public Color(float r, float g, float b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Color(Colors color) {
		this.r = color.getR();
		this.g = color.getG();
		this.b = color.getB();
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
}
