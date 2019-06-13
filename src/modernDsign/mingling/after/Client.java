package modernDsign.mingling.after;

/**
 * 
 * 命令模式： 将一个请求封装成一个对象，从而让你使用不用的请求把客户端参数化，对请求排队或者记录请求的日志，可以提供命令和撤销和恢复功能
 * 
 * 优点： 
 * 类间解耦 
 * 调用者角色与接收者角色之间没有任何依赖关系， 调用者实现功能时只需调用Command 抽象类的execute方法就可以，
 * 不需要了解到底是哪个接收者执行。
 * 
 * 可扩展性 
 * Command的子类可以非常容易地扩展， 而调用者Invoker和高层次的模块Client不产生严 重的代码耦合
 * 
 * 命令模式结合其他模式会更优秀
 * 命令模式可以结合责任链模式， 实现命令族解析任务； 结合模板方法模式， 则可以减少Command子类的膨胀问题。
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 定义我们的接头人
		Invoker xiaoSan = new Invoker(); // 接头人就是小三
		// 客户要求增加一项需求
		System.out.println("------------客户要求增加一项需求---------------");
		// 客户给我们下命令来
		Command command = new AddRequirementCommand();
		// 接头人接收到命令
		xiaoSan.setCommand(command);
		// 接头人执行命令
		xiaoSan.action();
	}
}
