package modernDsign.celve.after.two;

public class Calculator {

	// �ӷ���
	private final static String ADD_SYMBOL = "+";
	// ������
	private final static String SUB_SYMBOL = "-";

	public int exec(int a, int b, String symbol) {
		return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
	}
}
