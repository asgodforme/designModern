package modernDsign.mingling.before;

public class Client {

	public static void main(String[] args) {
		// ���ȿͻ��ҵ�������˵�� ����̸����
		// ���޸�
		System.out.println("-----------�ͻ�Ҫ������һ������---------------");
		Group rg = new RequirementGroup();
		// �ҵ�������
		rg.find();
		// ����һ������
		rg.add();
		// Ҫ�����ƻ�
		rg.plan();

		// ���ȿͻ��ҵ�������˵�� ����̸ҳ�棬 ���޸�
		System.out.println("----------�ͻ�Ҫ��ɾ��һ��ҳ��--------------");
		Group pg = new PageGroup();
		// �ҵ�������
		pg.find();
		// ɾ��һ������
		pg.delete();
		// Ҫ�����ƻ�
		pg.plan();
	}

}
