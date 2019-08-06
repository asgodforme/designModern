package modernDsign.guanchazhe.after;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// 定义出韩非子和李斯
		HanFeiZi hanFeiZi = new HanFeiZi();
		LiSi liSi = new LiSi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakfast();
		// 韩非子娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}
