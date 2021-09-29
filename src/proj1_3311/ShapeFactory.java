package proj1_3311;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
	      if(shapeType == null){
	          return null;
	       }		
	       if(shapeType.equals("Rectangle")){
	          return new Rectangle();
	          
	       } else if(shapeType.equals("Square")){
	          return new Square();
	          
	       } else if(shapeType.equals("Circle")){
	          return new Circle();
	       }
	       
	       return null;
	} //Reference: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
}
