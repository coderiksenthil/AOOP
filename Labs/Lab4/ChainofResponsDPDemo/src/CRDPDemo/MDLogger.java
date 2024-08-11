package CRDPDemo;

public class MDLogger extends AbstractLogger
{
	public MDLogger(int level)
	{
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) 
	   {		
	      System.out.println("Managing Director::Logger: " + message);
	   }
}
