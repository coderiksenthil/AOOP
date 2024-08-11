package FDPDemo;
//Step 2: Create concrete classes implementing the same interface. (Rectangle.java & Circle.java & Square.java)
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");

	}

}
