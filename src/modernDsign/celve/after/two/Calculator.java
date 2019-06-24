package modernDsign.celve.after.two;

public class Calculator {

	// ¼Ó·ûºÅ
	private final static String ADD_SYMBOL = "+";
	// ¼õ·ûºÅ
	private final static String SUB_SYMBOL = "-";

	public int exec(int a, int b, String symbol) {
		return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
	}
}
