package modernDsign.zuhe.before;

import java.util.List;

public interface IBranch {

	// �����Ϣ
	public String getInfo();

	// �������ݽڵ㣬 �����з���������з�һ��
	public void add(IBranch branch);

	// ����Ҷ�ӽڵ�
	public void add(ILeaf leaf);

	// ����¼���Ϣ
	public List<Object> getSubordinateInfo();
}
