package modernDsign.jianzhaozhe.after;

import java.util.ArrayList;

import modernDsign.jianzhaozhe.before.BenzModel;

public class Client {

	public static void main(String[] args) {
		/*
		 * �ͻ�����XX��˾�� ��Ҫ����һ��ģ�ͣ� Ȼ��XX��˾�͸������ϴ� ˵Ҫ����һ��ģ�ͣ� ����һ��˳�� Ȼ���Ҿ�������
		 */
		// ���run��˳��
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); // �ͻ�Ҫ�� runʱ��ʱ���ȷ�������
		sequence.add("start"); // ��������
		sequence.add("stop"); // ����һ�ξ�ͣ����
		// Ҫһ�����۳���
		BenzBuilder benzBuilder = new BenzBuilder();// ��˳������builder�࣬ ���������һ��������
		benzBuilder.setSequence(sequence);
		// �����һ�����۳�
		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
		// ���۳���һ�¿���
		benz.run();
	}
}
