package modernDsign.zhongjiezhe.after;

public abstract class AbstractColleague {

	// 库存，销售，采购都需要维护中介者，故通过提取公共部分到抽象类中进行维护,子类实例化之前必须实例化父类。
	
	// 依赖倒置：依赖于抽象不依赖细节
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
