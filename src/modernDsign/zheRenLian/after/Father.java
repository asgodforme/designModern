package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public class Father extends Handler {

	//����ֻ����Ů��������
	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	//���׵Ĵ�
	@Override
	protected void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}

}
