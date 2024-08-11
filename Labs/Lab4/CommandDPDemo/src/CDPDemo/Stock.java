package CDPDemo;

public class Stock 
{
	   private String name = "Creov Inc";
	   private int quantity = 95;

	   public void buy()
	   {
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	   }
	   public void sell()
	   {
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	   }
}
