// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String sName1 = args[0];
        String sName2 = args[1];
        String sName3 = args[2];
        int nTotalBill = Integer.parseInt(args[3]);
        double dValueToPay = (Math.ceil((double)(nTotalBill)/3.0));

        System.out.println("Dear " + sName3 + ", " + sName2 + " and " + sName1 +
        ": pay " + dValueToPay + " Shekels each.");
	}
}
