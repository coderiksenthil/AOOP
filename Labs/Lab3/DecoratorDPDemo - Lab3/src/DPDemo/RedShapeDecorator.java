package DPDemo;
//Step 4: Create concrete decorator class extending the ShapeDecorator class. (RedShapeDecorator.java)
public class RedShapeDecorator extends ShapeDecorator{
	public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}
