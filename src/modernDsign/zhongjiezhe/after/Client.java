package modernDsign.zhongjiezhe.after;

/**
 * 中介模式： 用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变他们之间的交互
 * 
 * 中介者模式的优点就是减少类间的依赖， 把原有的一对多的依赖变成了一对一的依赖 ,同事类只依赖中介者， 减少了依赖， 当然同时也降低了类间的耦合。
 * 
 * 中介者模式的缺点就是中介者会膨胀得很大， 而且逻辑复杂， 原本N个对象直接的相互依赖关系转换为中介者和同事类的依赖关系， 同事类越多，
 * 中介者的逻辑就越复杂。
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		// 采购人员采购电脑
		System.out.println("------采购人员采购电脑--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		// 销售人员销售电脑
		System.out.println("\n------销售人员销售电脑--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		// 库房管理人员管理库存
		System.out.println("\n------库房管理人员清库处理--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
