package CRDPDemo;

public class ChainPatternDemo 
{
	private static AbstractLogger getChainOfLoggers()
	{

	      AbstractLogger EMPlg = new EmpLogger(AbstractLogger.EMPLevel);
	      AbstractLogger RMlg = new RMLogger(AbstractLogger.RMLevel);
	      AbstractLogger MDlg = new MDLogger(AbstractLogger.MDLevel);

	      EMPlg.setNextLogger(RMlg);
	      RMlg.setNextLogger(MDlg);

	      return EMPlg;	
	   }

	   public static void main(String[] args) 
	   {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.EMPLevel, 
	         "This is an information from Employee.");

	      loggerChain.logMessage(AbstractLogger.RMLevel, 
	         "This is an Approval of information from Regional Manager.");

	      loggerChain.logMessage(AbstractLogger.MDLevel, 
	         "This is an Approval of information from Managing Director.");
	   }
	}

