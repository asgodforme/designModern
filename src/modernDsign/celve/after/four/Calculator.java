package modernDsign.celve.after.four;

/**
 * ����ö��
 * 
 * @author Administrator
 *
 */
public enum Calculator {
	// �ӷ�����
	ADD("+") {
		public int exec(int a, int b) {
			return a + b;
		}
	},
	// ��������
	SUB("-") {
		public int exec(int a, int b) {
			return a - b;
		}
	};
	String value = "";

	// �����Աֵ����
	private Calculator(String _value) {
		this.value = _value;
	}// ���ö�ٳ�Ա��ֵ

	public String getValue() {
		return this.value;
	}// ����һ��������

	public abstract int exec(int a, int b);
}
