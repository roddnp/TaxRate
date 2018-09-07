import java.util.Scanner;

public class TaxRates 
{
	public static void main ( String[] args )
	{
		
Scanner scan = new Scanner( System.in );
		
		System.out.println("Enter annual salary:");
	    String frontLeft = scan.nextLine();
	    int frontLeftInt = Integer.parseInt(frontLeft);
	    
	    System.out.println("Enter number of kids (if not put 0):");
	    String frontRight = scan.nextLine();
	    int frontRightInt = Integer.parseInt(frontRight);
	    
	    System.out.println("Enter age:");
	    String backLeft = scan.nextLine();
	    int backLeftInt = Integer.parseInt(backLeft);
	    
	   
	    
	    int x = 0;
	    double i =2.5;
	    
	   
	    
	    if (frontLeftInt > 10000 && frontLeftInt < 25000)
	    {
	    
	    
	    if ( frontRightInt >= 1)
		{
			for (i=2.5; i<frontRightInt; i++)
			{
				x += 500;
			}
			int WithChild = x + 1000;
			if ( backLeftInt < 15)
			{
				 double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.50);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt >15 && backLeftInt < 21)
			{
				double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.25);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt > 21 && backLeftInt < 63)
			{
				double taxRate = 500+(frontRightInt-500*.10) - x;
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt >63 && backLeftInt < 72)
			{
				double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.33);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt > 72 && backLeftInt < 80)
			{
				double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.66);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			else
			{
				double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.1);
				 System.out.println("Your tax payment is:" + taxRate);
			}
		}
		else
		{
			if ( backLeftInt < 15)
			{
				 double taxRate = 500+(frontRightInt-500*.10) - (frontRightInt*.50);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt >15 && backLeftInt < 21)
			{
				double taxRate = 500+(frontRightInt-500*.10) - (frontRightInt*.25);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt > 21 && backLeftInt < 63)
			{
				double taxRate = 500+(frontRightInt-500*.10);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt >63 && backLeftInt < 72)
			{
				double taxRate = 500+(frontRightInt-500*.10) - (frontRightInt*.33);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			if ( backLeftInt > 72 && backLeftInt < 80)
			{
				double taxRate = 500+(frontRightInt-500*.10) - (frontRightInt*.66);
				 System.out.println("Your tax payment is:" + taxRate);
			}
			else
			{
				double taxRate = 500+(frontRightInt-500*.10) - x - (frontRightInt*.1);
				 System.out.println("Your tax payment is:" + taxRate);
			}
		}
	    
	    if ( frontLeftInt > 25000)
	    {
	    	if ( frontLeftInt < 75000)
	    	{
	    		if ( frontRightInt >= 1)
	    		{
	    			for (i=2.5; i<frontRightInt; i++)
	    			{
	    				x += 500;
	    			}
	    			int WithChild = x + 1000;
	    			
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 5000+(frontRightInt-5000*.10) - x - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.10) - x - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.10) - x;
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.10) - x - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.10) - x - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.10) - x - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    		else
	    		{
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 5000+(frontRightInt-5000*.20) - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.20) - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.20);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.20) - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.20) - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 5000+(frontRightInt-5000*.20) - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    	
	    	
	    	
	    	if ( frontLeftInt > 75000 && frontLeftInt < 250000)
	    	{
	    		if ( frontRightInt >= 1)
	    		{
	    			for (i=2.5; i<frontRightInt; i++)
	    			{
	    				x += 500;
	    			}
	    			int WithChild = x + 1000;
	    			
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 10000+(frontRightInt-10000*.30) - x - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - x - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - x;
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - x - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - x - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - x - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    		else
	    		{
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 10000+(frontRightInt-10000*.30) - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) ;
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 10000+(frontRightInt-10000*.30) - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    	}
	    	if (frontLeftInt > 250000)
	    	{
	    		if ( frontRightInt >= 1)
	    		{
	    			for (i=2.5; i<frontRightInt; i++)
	    			{
	    				x += 500;
	    			}
	    			int WithChild = x + 1000;
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 25000+(frontRightInt-25000*.50) - x - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - x - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - x;
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - x - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - x - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - x - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    		else
	    		{
	    			if ( backLeftInt < 15)
	    			{
	    				 double taxRate = 25000+(frontRightInt-25000*.50) - (frontRightInt*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >15 && backLeftInt < 21)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - (frontRightInt*.25);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 21 && backLeftInt < 63)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt >63 && backLeftInt < 72)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - (frontRightInt*.33);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			if ( backLeftInt > 72 && backLeftInt < 80)
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50) - (frontRightInt*.66);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    			else
	    			{
	    				double taxRate = 25000+(frontRightInt-25000*.50)  - (frontRightInt*.1);
	    				 System.out.println("Your tax payment is:" + taxRate);
	    			}
	    		}
	    	}
	    		
	    }
	    
	    
	}
}
	}
	}
	// making changes

	    

