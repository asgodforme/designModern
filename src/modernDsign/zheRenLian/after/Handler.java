package modernDsign.zheRenLian.after;

import modernDsign.zheRenLian.before.IWomen;

public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	
	//能处理的级别
	private int level = 0;
	//责任传递， 下一个人责任人是谁
	private Handler nextHandler;
	//每个类都要说明一下自己能处理哪些请求
	public Handler(int level) {
		super();
		this.level = level;
	}
	
	//一个女性（女儿、 妻子或者是母亲） 要求逛街， 你要处理这个请求
	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else {
			if (this.nextHandler != null) {
				this.nextHandler.handleMessage(women);
			} else {
				System.out.println("---没地方请示了， 按不同意处理---\n");
			}
		}
	}
	
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	//有请示那当然要回应
	protected abstract void response(IWomen women);
	
	
	
}
