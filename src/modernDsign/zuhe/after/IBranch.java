package modernDsign.zuhe.after;

import java.util.List;

public interface IBranch extends ICorp {

	// �ܹ�����С������Ҷ�ڵ㣩 �����Ǿ�����֦�ڵ㣩
	public void addSubordinate(ICorp corp);

	// �һ�Ҫ�ܹ������������Ϣ
	public List<ICorp> getSubordinate();
	
	/*
	 * ������Ӧ����һ������delSubordinate(ICorp corp)�� ɾ������ �����������û���õ��Ͳ�д������
	 */
}
