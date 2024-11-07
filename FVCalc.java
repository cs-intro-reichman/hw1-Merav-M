// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int nCurrentValue = Integer.parseInt(args[0]);
		double dAnnualInterestRate = Double.parseDouble(args[1]);
		int nNumberOfYears = Integer.parseInt(args[2]);
		
		double dFutureValue = ((double)(nCurrentValue)) * Math.pow(1.0 + (dAnnualInterestRate/100),(double)nNumberOfYears);

		System.out.println("After " + nNumberOfYears + " years, $" + nCurrentValue + 
						   " saved at " + dAnnualInterestRate + "% will yield $" + (int)dFutureValue);
	}
}