package point;

import java.awt.Color;

import colour.Colourable;

public class ColouredPoint extends Point implements Colourable {

	Color colour;

	public ColouredPoint(Color c) {
		super(0, 0);
		this.colour = c;
	}

	public ColouredPoint(int x, int y, Color c) {
		super(x, y);
		this.colour = c;
	}

	@Override
	public Color getColour() {
		return colour;
	}

	@Override
	public void setColour(Color colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return super.toString() + " " + colour;
	}

}
