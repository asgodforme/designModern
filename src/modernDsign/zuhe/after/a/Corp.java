package modernDsign.zuhe.after.a;

public abstract class Corp {

	// ��˾ÿ���˶�������
	private String name = "";
	// ��˾ÿ���˶�ְλ
	private String position = "";
	// ��˾ÿ���˶���нˮ
	private int salary = 0;

	public Corp(String _name, String _position, int _salary) {
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}// ���Ա����Ϣ

	public String getInfo() {
		String info = "";
		info = "������ " + this.name;
		info = info + "\tְλ�� " + this.position;
		info = info + "\tнˮ�� " + this.salary;
		return info;
	}
}
