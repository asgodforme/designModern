package modernDsign.celve.after.one;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// �������������������
		int a = Integer.parseInt(args[0]);
		String symbol = args[1]; // ����
		int b = Integer.parseInt(args[2]);
		System.out.println("����Ĳ���Ϊ�� " + Arrays.toString(args));
		// ����һ��������
		CalCulator cal = new CalCulator();
		System.out.println("���н��Ϊ�� " + a + symbol + b + "=" + cal.exec(a, b, symbol));
	}

}
