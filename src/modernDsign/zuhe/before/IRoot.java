package modernDsign.zuhe.before;

import java.util.List;

public interface IRoot {

	// �õ��ܾ������Ϣ
	public String getInfo();

	// �ܾ����±�Ҫ��С���� ��Ҫ������С���� �����з����ܾ��� ���Ǹ���֦�ڵ�
	public void add(IBranch branch);

	// ��Ҫ��������Ҷ�ڵ�
	public void add(ILeaf leaf);

	// ��Ȼ�����ӣ� �ǻ�Ҫ�ܹ������� �������ܾ���֪������������Щ��
	public List<Object> getSubordinateInfo();
}
