package modernDsign.daili.before;

public class Client {

	public static void main(String[] args) {
		// ����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");// ��ʼ����Ϸ�� ����ʱ���
		System.out.println("��ʼʱ���ǣ� 2009-8-25 10:45");
		player.login("zhangSan", "password");
		// ��ʼɱ��
		player.killBoss();
		// ����
		player.upgrade();
		// ��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ� 2009-8-26 03:40");
	}
}
