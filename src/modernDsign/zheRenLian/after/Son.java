package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public class Son extends Handler {

	public Son() {
		super(SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ� ͬ��\n");
	}

}
