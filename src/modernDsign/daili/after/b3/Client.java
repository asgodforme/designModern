package modernDsign.daili.after.b3;

/**
 * ǿ�ƴ���ǿ�ƴ���ĸ������Ҫ����ʵ��ɫ���ҵ������ɫ�� ����
��ֱ�ӷ�����ʵ��ɫ�� 
 * 
 * һ�������ʵ�ֶ���ӿڣ� ��ɲ�ͬ��������ϡ� Ҳ����˵�����಻��������ʵ������ �ӿڣ� Ҳ����ʵ�������ӿ���ɲ�ͬ������
 * ���Ҵ����Ŀ������Ŀ����󷽷��Ļ���������ǿ�� ������ǿ�ı���ͨ�����Ƕ�Ŀ�����ķ����������غ͹��ˡ�
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ����Ϸ�Ľ�ɫ
		IGamePlayer player = new GamePlayer("����").getProxy();
		// ��ʼ����Ϸ�� ����ʱ���
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
