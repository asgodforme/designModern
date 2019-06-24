package modernDsign.daili.after.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import modernDsign.daili.before.GamePlayer;
import modernDsign.daili.before.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		// ����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");
		// ����һ��handler
		InvocationHandler handler = new GamePlayIH(player);
		// ��ʼ����Ϸ�� ����ʱ���
		System.out.println("��ʼʱ���ǣ� 2009-8-25 10:45");
		// ������class loader
		ClassLoader cl = player.getClass().getClassLoader();
		// ��̬����һ��������
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, player.getClass().getInterfaces(), handler);
		// ��¼
		proxy.login("zhangSan", "password");// ��ʼɱ��
		proxy.killBoss();
		// ����
		proxy.upgrade();
		// ��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ� 2009-8-26 03:40");
	}
}
