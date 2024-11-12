// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int nMaxLim = Integer.parseInt(args[0]);

		int nNum1 = (int)(Math.random() * nMaxLim);
		int nNum2 = (int)(Math.random() * nMaxLim);
		int nNum3 = (int)(Math.random() * nMaxLim);

		int nMax = (Math.max(nNum1,Math.max(nNum2,nNum3)));
		int nMin = (Math.min(nNum1,Math.min(nNum2,nNum3)));
		int nMiddle = nNum1 + nNum2 + nNum3 - (nMax + nMin);

		System.out.println(nNum1 + " " + nNum2 + " " + nNum3);
		System.out.println(nMin + " " + nMiddle + " " + nMax);
	}
}
