package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public class Husband extends Handler {

	public Husband() {
		super(HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ� ͬ��\n");
	}

}
