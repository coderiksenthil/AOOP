package BDPDemo;
//Step 4: Create concrete class implementing the Shape interface. (Circle.java)
public class Circle extends Shape{
	private int x, y, radius;

	   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }
}
