package CRDPDemo;

public class EmpLogger extends AbstractLogger
{
	public EmpLogger(int level)
	{
	      this.level = level;
	}

	   @Override
	   protected void write(String message) 
	   {		
	      System.out.println("Standard Employee::Logger: " + message);
	   }
}
