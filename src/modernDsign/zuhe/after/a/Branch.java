package modernDsign.zuhe.after.a;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {
	// �쵼�±�����Щ�¼��쵼��С��
	List<Corp> subordinateList = new ArrayList<Corp>();

	// ���캯���Ǳ����
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}// ����һ��������������СͷĿ��Ҳ�����Ǹ�С��

	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}// ������Щ����

	public List<Corp> getSubordinate() {
		return this.subordinateList;
	}
}
