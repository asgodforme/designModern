package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public class Women implements IWomen {

	/*
	 * ͨ��һ��int���͵Ĳ�����������Ů�ĸ���״�� 1--δ���� 2--���� 3--����
	 */
	private int type = 0;

	// ��Ů����ʾ
	private String request;

	public Women(int type, String request) {
		super();
		this.type = type;
		// Ϊ�˱�����ʾ�� ���������˵㴦��
		switch (this.type) {
		case 1:
			this.request = "Ů���������ǣ� " + request;
			break;
		case 2:
			this.request = "���ӵ������ǣ� " + request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ� " + request;
		}
	}

	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}

}
