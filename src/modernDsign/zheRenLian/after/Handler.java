package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	
	//�ܴ���ļ���
	private int level = 0;
	//���δ��ݣ� ��һ������������˭
	private Handler nextHandler;
	//ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	public Handler(int level) {
		super();
		this.level = level;
	}
	
	//һ��Ů�ԣ�Ů���� ���ӻ�����ĸ�ף� Ҫ���֣� ��Ҫ�����������
	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(women);
			} else {
				System.out.println("---û�ط���ʾ�ˣ� ����ͬ�⴦��---\n");
			}
		}
	}
	
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	//����ʾ�ǵ�ȻҪ��Ӧ
	protected abstract void response(IWomen women);
	
	
	
}
