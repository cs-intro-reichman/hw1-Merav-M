// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int nNumber = Integer.parseInt(args[0]);
		int nHundreds = (nNumber/100);
		int nTens = ((nNumber/10) % 10);
		int nOnes = (nNumber % 10);

		System.out.println(nHundreds + " hundreds, " + nTens +" tens, and " + nOnes + " ones");
	}
}