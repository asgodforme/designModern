package modernDsign.zheRenLian.before;

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
		this.request = request;
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
