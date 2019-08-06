package modernDsign.zuhe.before;

import java.util.ArrayList;
import java.util.List;

public class Branch implements IBranch {
	// �洢�ӽڵ����Ϣ
	private List<Object> subordinateList = new ArrayList<>();
	// ��֦�ڵ������
	private String name = "";
	// ��֦�ڵ��ְλ
	private String position = "";
	// ��֦�ڵ��нˮ
	private int salary = 0;

	// ͨ�����캯��������֦�ڵ�Ĳ���
	public Branch(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}// ����һ������֦�ڵ�

	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}// ����һ��Ҷ�ӽڵ�

	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}// ����Լ���֦�ڵ����Ϣ

	public String getInfo() {
		String info = "";
		info = "���ƣ� " + this.name;
		info = info + "\tְλ�� " + this.position;
		info = info + "\tнˮ�� " + this.salary;
		return info;
	}// ����¼�����Ϣ

	@Override
	public List<Object> getSubordinateInfo() {
		return this.subordinateList;
	}
}
