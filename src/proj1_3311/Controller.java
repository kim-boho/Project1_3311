package proj1_3311;

import java.util.Random;

public class Controller {
	//Controller class
	public static void createShapeArray(int length, Shape[] shapeArr) {
		int x = 50; int y = 50;
		for(int i=0; i<length; i++) {
			ShapeFactory shFactory = new ShapeFactory();
			Shape newShape;
			if(Controller.pickRandomShape() == 0) {
				//create rectangle
				newShape = shFactory.getShape("Rectangle");
				newShape.setCoordinate(x, y);
			} else if(Controller.pickRandomShape() == 1) {
				//create square.
				newShape = shFactory.getShape("Square");
				newShape.setCoordinate(x, y);
			} else {
				//create circle.
				newShape = shFactory.getShape("Circle");
				newShape.setCoordinate(x, y);
			}
			shapeArr[i] = newShape;
			x += 80;
			y += 80;
			}
		}
		
	private static int pickRandomShape() {
			Random r = new Random();
			return r.nextInt(3);
			//To pick shape randomly. 0 = rectangle, 1 = square, 2 = circle.
		}
}
