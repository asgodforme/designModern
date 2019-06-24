package modernDsign.celve.after.four;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// 输入的两个参数是数字
		int a = 1;
		String symbol = "+"; // 符号
		int b = 2;
		System.out.println("输入的参数为： " + Arrays.toString(args));
		System.out.println("运行结果为： " + a + symbol + b + "=" + Calculator.ADD.exec(a, b));
	}
}
