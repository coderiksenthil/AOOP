package ADPDemo;
//Step 3: Create an Abstract class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType) ;
}
