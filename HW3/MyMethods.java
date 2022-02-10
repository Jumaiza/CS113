//Zaid Abu Jumaiza CS113004

package cs113;

public class MyMethods {
	
	public String Surface(int width, int length, int height) {
		
		int area = 2*(length*width)+ 2*(length*height)+2*(height*width);
		
		return "The total surface area is: "+area;
		
	}
	
	public void swapFaceValues(Die die1, Die die2) {
		
		int value1 = die1.getFaceValue();
		int value2 = die2.getFaceValue();
		
		die1.setFaceValue(value2);
		die2.setFaceValue(value1);
		
	}

}
