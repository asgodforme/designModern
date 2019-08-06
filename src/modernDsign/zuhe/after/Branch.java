package modernDsign.zuhe.after;

import java.util.ArrayList;
import java.util.List;

public class Branch implements IBranch {
	
	// �쵼Ҳ���ˣ� Ҳ������
	private String name = "";
	// �쵼���쵼��ͬ�� Ҳ��ְλ����
	private String position = "";
	// �쵼Ҳ����нˮ��
	private int salary = 0;
	// �쵼�±�����Щ�¼��쵼��С��
	List<ICorp> subordinateList = new ArrayList<ICorp>();

	// ͨ�����캯�������쵼����Ϣ
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}// ����һ��������������СͷĿ��Ҳ�����Ǹ�С��

	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}// ������Щ����

	public List<ICorp> getSubordinate() {
		return this.subordinateList;
	}// �쵼Ҳ���ˣ���Ҳ����Ϣ

	public String getInfo() {
		String info = "";
		info = "������ " + this.name;
		info = info + "\tְλ�� " + this.position;
		info = info + "\tнˮ�� " + this.salary;
		return info;
	}
}
