package modernDsign.guanchazhe.before;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// ����������Ӻ���˹
		LiSi liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		// �۲����
		Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
		// ��ʼ�����̣߳� ���
		watchBreakfast.start();
		// �۲��������
		Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
		watchFun.start();
		// Ȼ�����ǿ����������ڸ�ʲô
		Thread.sleep(1000); // ���̵߳ȴ�1����������ִ��
		hanFeiZi.haveBreakfast();
		// ������������
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}
}
