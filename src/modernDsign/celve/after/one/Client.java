package modernDsign.celve.after.one;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// 输入的两个参数是数字
		int a = Integer.parseInt(args[0]);
		String symbol = args[1]; // 符号
		int b = Integer.parseInt(args[2]);
		System.out.println("输入的参数为： " + Arrays.toString(args));
		// 生成一个运算器
		CalCulator cal = new CalCulator();
		System.out.println("运行结果为： " + a + symbol + b + "=" + cal.exec(a, b, symbol));
	}

}
