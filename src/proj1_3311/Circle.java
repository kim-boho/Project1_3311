package proj1_3311;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
		super();
		radius = r.nextInt(20) + 20;
		//Pick radius of circle randomly within 1-50.
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
