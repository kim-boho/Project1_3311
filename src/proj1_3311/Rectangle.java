package proj1_3311;

public class Rectangle extends Shape {
	
	protected int width;
	protected int height;
	
	public Rectangle() {
		super();
		width = r.nextInt(40) + 40;
		height = r.nextInt(40) + 40;
		//Pick width and height of rectangle randomly within 1-100.
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}


}
