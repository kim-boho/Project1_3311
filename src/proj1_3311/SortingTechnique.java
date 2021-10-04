package proj1_3311;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTechnique {
	public static void sortShapes(Shape[] shapes) {
		for(int i = 0; i < shapes.length; i++) {
			int minIndex = i;
			for(int j = i+1; j < shapes.length; j++) {
				if((shapes[minIndex]).compareTo(shapes[j]) > 0) {
					minIndex = j;
				}
			}// Selection sort.
			
			if(minIndex != i) {
				int tempx = shapes[i].getX();
				int tempy = shapes[i].getY();
				shapes[i].setX(shapes[minIndex].getX());
				shapes[i].setY(shapes[minIndex].getY());
				shapes[minIndex].setX(tempx);
				shapes[minIndex].setY(tempy);
				// Switch upperX and Y.
				
				Shape temp = shapes[i];
				shapes[i] = shapes[minIndex];
				shapes[minIndex] = temp;
				// Switch index.
			}
		}
	}
}
