package BDPDemo;
//Step 2: Create concrete bridge implementer classes implementing the DrawAPI interface. (RedScircle.java & GreenCircle.java)
public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");

	}

}
