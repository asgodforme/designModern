package modernDsign.jianzhaozhe.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		/*
		 * �ͻ�����XX��˾�� ��Ҫ����һ��ģ�ͣ� Ȼ��XX��˾�͸������ϴ� ˵Ҫ����һ��ģ�ͣ� ����һ��˳�� Ȼ���Ҿ�������
		 */
		BenzModel benz = new BenzModel();
		// ���run��˳��
		List<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); // �ͻ�Ҫ�� run��ʱ���ȷ�������
		sequence.add("start"); // ��������
		sequence.add("stop"); // ����һ�ξ�ͣ����
		// ���ǰ����˳���豼�۳�
		benz.setSequence(sequence);
		benz.run();
	}
}
