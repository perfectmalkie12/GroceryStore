import java.util.Scanner;
public class 	GroceryStore
{//satart class

  public static void main(String [] args)
  {// satart main methord
  
    Scanner keyboard = new Scanner(System.in);
	
	//declare constant variable 
	final int WEIGHING = 7;
	final double PER_KILOGRAMS =3.40;
	final double POTATOES = 69.99;
	
	// declare variable
	int iFirstCrate, iSecondCrate, iNumBags;
	double rTotalCost,rTotalRevenue,rProfit,rTotalWeight;
	
	//input
	System.out.print("enter the weight of the first crate  in kilogram: ");
	iFirstCrate= keyboard.nextInt();
	System.out.print("enter the weight of the second  crate  in kilogram: ");
	iSecondCrate = keyboard.nextInt();
    
	//processing
    rTotalWeight = iFirstCrate + iSecondCrate;
    iNumBags = (int) rTotalWeight/7;
	rTotalCost = rTotalWeight * PER_KILOGRAMS;
	rTotalRevenue = iNumBags * POTATOES;
	rProfit  = rTotalRevenue - rTotalCost;
	
	//OUTPUT
	
	System.out.println("**********************************************");
    System.out.println("Number of bags of potatoes to be sold: " + iNumBags);
	System.out.println("The total cost of potatoes: " + rTotalCost);
	System.out.println("The total revenue of potatoes: " + rTotalRevenue);
	System.out.println("profit to be made: " + rProfit);
  }
}