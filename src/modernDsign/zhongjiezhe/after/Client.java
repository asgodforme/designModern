package modernDsign.zhongjiezhe.after;

/**
 * �н�ģʽ�� ��һ���н�����װһϵ�еĶ��󽻻����н���ʹ��������Ҫ��ʾ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
 * 
 * �н���ģʽ���ŵ���Ǽ������������� ��ԭ�е�һ�Զ�����������һ��һ������ ,ͬ����ֻ�����н��ߣ� ������������ ��ȻͬʱҲ������������ϡ�
 * 
 * �н���ģʽ��ȱ������н��߻����͵úܴ� �����߼����ӣ� ԭ��N������ֱ�ӵ��໥������ϵת��Ϊ�н��ߺ�ͬ�����������ϵ�� ͬ����Խ�࣬
 * �н��ߵ��߼���Խ���ӡ�
 * 
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		// �ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		// ������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		// �ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}
}
