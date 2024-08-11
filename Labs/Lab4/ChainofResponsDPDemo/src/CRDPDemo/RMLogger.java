package CRDPDemo;

public class RMLogger extends AbstractLogger
{
	public RMLogger(int level)
	{
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) 
	   {		
	      System.out.println("Regional Manager::Logger: " + message);
	   }
}
