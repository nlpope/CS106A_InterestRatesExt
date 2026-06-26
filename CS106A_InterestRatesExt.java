/**
 * File: CS106A_InterestRatesExt.java
 * ----------------------------
 * This Java program incrementally calculates the balance of an account 
 * after a specified amount of years given the interest rate 
 * and principal.
 * 
 * interest rate formula:
 * ((interest Amount [percentage] * Principal [starting balance]) + Principal) * Time Elapsed
 */

public class CS106A_InterestRatesExt extends CS106A_InterestRates
{	
	public void run()
	{ 
		changeIntroMsg();
		promptUser();
		promptUserTimeElapsed();
		calculateAndDisplayInterestRates();
		println("donezo");
	}
	
	
	private void changeIntroMsg()
	{
		introMsg = "Interest rate calculation " +
				"program. Calculates the balance of " +
				"an account after a specified amount " +
				"of years given the interest rate and " +
				"principal.";
	}
	
	
	private void promptUserTimeElapsed()
	{
		int userTime = readInt("Enter time elapsed: ");
		timeElapsed = userTime;
	}
}