package engineGraphics;

public enum Colors {

	red(1, 0, 0), blue(0, 0, 1), black(1, 1, 1);
	
	private float r, g, b;
	
	Colors(float r, float g, float b) {
		this.r = r;
		this.g = g;
		this.b = b;
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
