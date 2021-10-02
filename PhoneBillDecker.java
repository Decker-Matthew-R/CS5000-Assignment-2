//Import Scanner Utility
import java.util.Scanner;

public class PhoneBillDecker 
{
	public static void main (String[] args)
	{
		//Direct Scanner Objecet
		Scanner input = new Scanner(System.in);
		
		//Assign Variables
		final double FEEREG = 15.00;
		final double FEEPRE = 25.00;
		final int FREEMINSREG = 60;
		final int FREEMINSPREDAY = 75;
		final int FREEMINSPRENIGHT = 100;
		final double RATEREG = .25;
		final double RATEPRENIGHT = .03;
	
				
	
		//Prompt User to Enter the Account Number
		System.out.print("Please Enter Your Account Number: ");
		int account = input.nextInt();
		
		//Prompt User to Enter Service Code
		System.out.print("Please Enter Service Code 0 For Regular Service or Service Code 1 For Premium Service: ");
		int serviceType = input.nextInt();
		
		if (serviceType == 0)
		{
			System.out.print("Please Enter the Number of Minutes Used: ");
			int minutesReg = input.nextInt();
			System.out.println("");
			System.out.println("Account Number:\t" + account);
			System.out.println("Service Type:  \t" + "Regular" );
			System.out.println("Total Minutes: \t" + minutesReg);
			if (minutesReg <= 60)
			
				System.out.println("Amount Due:\t" + "$15.00");
			else
				System.out.println("Amount Due:\t" + "$" + (FEEREG + ((minutesReg - FREEMINSREG) * .25)));
		}	
			
		else if (serviceType == 1)
		{	
			System.out.print("Please Enter the Number of Day Time Minutes Used: ");
			int minutesPreDay = input.nextInt();
			System.out.print("Please Enter the Number of Night Time Minutes Used: ");
			int minutesPreNight = input.nextInt();
			System.out.println("");
			System.out.println("Account Number: \t\t" + account);
			System.out.println("Service Type:  \t\t        " + "Premium");
			System.out.println("Daytime Minutes:\t\t" + minutesPreDay);
			System.out.println("Nighttime Minutes:\t\t" + minutesPreNight);
			if (minutesPreDay <= 75 && minutesPreNight <= 100)
				System.out.println("Amount Due:\t\t        " + "$" + FEEPRE);
			else if (minutesPreDay > 75 && minutesPreNight <= 100)
				System.out.println("Amount Due:\t\t        " + "$" + (FEEPRE + (minutesPreDay - FREEMINSPREDAY) * .08));
			else if (minutesPreDay <= 75 && minutesPreNight > 100)
				System.out.println("Amount Due:\t\t        " + "$" + (FEEPRE + (minutesPreNight - FREEMINSPRENIGHT) * RATEPRENIGHT));
			else 
				System.out.println ("Amount Due:\t\t        " + "$" + (FEEPRE + ((minutesPreDay - FREEMINSPREDAY)*.08) + ((minutesPreNight - FREEMINSPRENIGHT)*RATEPRENIGHT)));
								
		}	
	}		
}