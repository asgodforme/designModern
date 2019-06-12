package modernDsign.zheRenLian.before;

import java.util.ArrayList;
import java.util.Random;

/**
 * ְ��綨������ 
 * ��Ů���������ʾ�� Ӧ���ڸ����������������� ���������Ρ� ��������Ů������ʾ�� ���Father��Ӧ����֪��Ů���������Լ�����
 * ��������Client���н�����װ������ Ҳ����˵ ԭ��Ӧ���Ǹ�����������������׸�����������д��� ��Ӧ���������ġ�
 * 
 * ����ӷ�� 
 * ������Client����д��if...else���ж������� �����������ܴ�������͵���ʾ��ԱԽ �࣬ if...else���жϾ�Խ�࣬ ���뿴��
 * ӷ�׵������жϻ���ô�пɶ��ԣ� ��
 * 
 * ��Ϲ��� 
 * ����ʲô��˼�أ� ����Ҫ����Women��type������ʹ��IHandler���Ǹ�ʵ������������ �� ��һ�������ǣ�
 * ���IHandler��ʵ���������չ��ô�죿 �޸�Client�ࣿ �뿪��ԭ��Υ�� �ˣ�
 * 
 * �쳣���Ƿ���� 
 * ����ֻ�����ɷ���ʾ�� ������ӣ�����һ���ִ�Ů�Դ�Խ���Ŵ��ˣ� ����ʲô������ �ĵ¡��� ���Լ��ĸ�����ʾ�ˣ� ����Ӧ�����δ���
 * ���ǵĳ����Ͽ�û�����ֳ����� �߼�ʧ ���ˣ�
 * 
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
		// �����ѡ����Ů��
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		} // ����������ʾ����
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		for (IWomen women : arrayList) {
			if (women.getType() == 1) { // δ�����Ů�� ��ʾ����
				System.out.println("\n--------Ů��������ʾ-------");
				father.handleMessage(women);
			} else if (women.getType() == 2) { // �ѻ��ٸ��� ��ʾ�ɷ�
				System.out.println("\n--------�������ɷ���ʾ-------");
				husband.handleMessage(women);
			} else if (women.getType() == 3) { // ĸ����ʾ����
				System.out.println("\n--------ĸ���������ʾ-------");
				son.handleMessage(women);
			} else {
				// ��ʱʲôҲ����
				System.out.println("else");
			}
		}
	}
}
