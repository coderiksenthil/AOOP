package BDPDemo;
//Step 2: Create concrete bridge implementer classes implementing the DrawAPI interface. (RedScircle.java & GreenCircle.java)
public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }

	}