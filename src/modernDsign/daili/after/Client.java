package modernDsign.daili.after;

import modernDsign.daili.before.GamePlayer;
import modernDsign.daili.before.IGamePlayer;

/**
 * 
 * ����ģʽ��
 * 
 * Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * 
 * 
 * �� ְ������
��ʵ�Ľ�ɫ����ʵ��ʵ�ʵ�ҵ���߼��� ���ù��������Ǳ�ְ������� ͨ�����ڵĴ���
���һ������ �����Ľ�����Ǳ�̼��������
�� ����չ��
���������ɫ����ʱ���ᷢ���仯�ģ� ֻҪ��ʵ���˽ӿڣ� �¹�����α仯�� ���Ӳ���
����������ƣ��ӿڣ� �� �����ǵĴ�������ȫ�Ϳ����ڲ����κ��޸ĵ������ʹ�á�
�� ���ܻ�
�����������ϵĽ����л�û�����ֳ����� �������������µĶ�̬�����½�����ͻῴ��
��������ܻ�����Ȥ�Ķ���Ҳ���Կ���Struts����ΰѱ�Ԫ��ӳ�䵽�����ϵġ�
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");
		// Ȼ���ٶ���һ��������
		IGamePlayer proxy = new GamePlayProxy(player);
		// ��ʼ����Ϸ�� ����ʱ���
		System.out.println("��ʼʱ���ǣ� 2009-8-25 10:45");
		proxy.login("zhangSan", "password");
		// ��ʼɱ��
		proxy.killBoss();
		// ����
		proxy.upgrade();
		// ��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ� 2009-8-26 03:40");
	}
}
