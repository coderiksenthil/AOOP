package FDPDemo;
//Step 2: Create concrete classes implementing the same interface. (Rectangle.java & Circle.java & Square.java)
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");

	}

}
