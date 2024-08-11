package DPDemo;
//Step 3: Create abstract decorator class implementing the Shape interface. (ShapeDecorator.java)
public abstract class ShapeDecorator implements Shape {

	 protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }
	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
