package modernDsign.zheRenLian.before;

public class Son implements IHandler {

	@Override
	public void handleMessage(IWomen women) {
		System.out.println("ĸ�׵���ʾ�ǣ� "+women.getRequest());
		System.out.println("���ӵĴ��ǣ� ͬ��");
	}

}
