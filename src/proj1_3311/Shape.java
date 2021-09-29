package proj1_3311;

import java.awt.Color;
import java.util.Random;

public abstract class Shape implements Comparable<Shape> {
	protected int upperX; 
	protected int upperY;
	protected Color shapeColor;
	protected Random r = new Random();
	
	public Shape() {
		shapeColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
		// Pick random color for created shape.
	}
	public void setCoordinate(int x, int y) {
		upperX = x;
		upperY = y;
	}
	public Color getColor() {
		return shapeColor;
	}
	public int getX() {
		return upperX;
	}
	public int getY() {
		return upperY;
	}
	public void setX(int x) {
		this.upperX = x;
	}
	public void setY(int y) {
		this.upperY = y;
	}
	
	
	public abstract double getArea();

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if(this.getArea() > o.getArea()) {
			return 1;
		} else if(this.getArea() == o.getArea()) {
			return 0;
		} else {
			return -1;
		}
	} 

}
