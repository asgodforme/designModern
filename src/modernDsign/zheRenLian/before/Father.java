package modernDsign.zheRenLian.before;

public class Father implements IHandler {

	@Override
	public void handleMessage(IWomen women) {
		System.out.println("Ů������ʾ�ǣ� "+women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��");
	}

}
