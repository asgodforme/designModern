package modernDsign.guanchazhe.after;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// ����������Ӻ���˹
		HanFeiZi hanFeiZi = new HanFeiZi();
		LiSi liSi = new LiSi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakfast();
		// ������������
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}
