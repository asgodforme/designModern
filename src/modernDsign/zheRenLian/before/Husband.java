package modernDsign.zheRenLian.before;

public class Husband implements IHandler {

	@Override
	public void handleMessage(IWomen women) {
		System.out.println("���ӵ���ʾ�ǣ� "+women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ� ͬ��");
	}

}
