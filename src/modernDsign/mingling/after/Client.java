package modernDsign.mingling.after;

/**
 * 
 * ����ģʽ�� ��һ�������װ��һ�����󣬴Ӷ�����ʹ�ò��õ�����ѿͻ��˲��������������Ŷӻ��߼�¼�������־�������ṩ����ͳ����ͻָ�����
 * 
 * �ŵ㣺 
 * ������ 
 * �����߽�ɫ������߽�ɫ֮��û���κ�������ϵ�� ������ʵ�ֹ���ʱֻ�����Command �������execute�����Ϳ��ԣ�
 * ����Ҫ�˽⵽�����ĸ�������ִ�С�
 * 
 * ����չ�� 
 * Command��������Էǳ����׵���չ�� ��������Invoker�͸߲�ε�ģ��Client�������� �صĴ������
 * 
 * ����ģʽ�������ģʽ�������
 * ����ģʽ���Խ��������ģʽ�� ʵ��������������� ���ģ�巽��ģʽ�� ����Լ���Command������������⡣
 * 
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// �������ǵĽ�ͷ��
		Invoker xiaoSan = new Invoker(); // ��ͷ�˾���С��
		// �ͻ�Ҫ������һ������
		System.out.println("------------�ͻ�Ҫ������һ������---------------");
		// �ͻ���������������
		Command command = new AddRequirementCommand();
		// ��ͷ�˽��յ�����
		xiaoSan.setCommand(command);
		// ��ͷ��ִ������
		xiaoSan.action();
	}
}
