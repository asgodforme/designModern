package modernDsign.celve.after.four;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// �������������������
		int a = 1;
		String symbol = "+"; // ����
		int b = 2;
		System.out.println("����Ĳ���Ϊ�� " + Arrays.toString(args));
		System.out.println("���н��Ϊ�� " + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
	}
}
