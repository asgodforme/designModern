package modernDsign.zhongjiezhe.after;

public abstract class AbstractColleague {

	// ��棬���ۣ��ɹ�����Ҫά���н��ߣ���ͨ����ȡ�������ֵ��������н���ά��,����ʵ����֮ǰ����ʵ�������ࡣ
	
	// �������ã������ڳ�������ϸ��
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
