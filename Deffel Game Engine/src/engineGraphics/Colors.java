package engineGraphics;

public enum Colors {

	//Enums
	red(1, 0, 0), blue(0, 0, 1), black(1, 1, 1), green(0, 1, 0), white(0, 0, 0);
	
	//Defining the variables
	private float r, g, b;
	
	//Constructor
	Colors(float r, float g, float b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	//Getters and Setters
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
