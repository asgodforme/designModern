package modernDsign.guanchazhe.before;

public class HanFeiZi implements IHanFeiZi {

	// �������Ƿ��ڳԷ��� ��Ϊ��ص��жϱ�׼
	private boolean isHavingBreakfast = false;
	// �������Ƿ�������
	private boolean isHavingFun = false;

	// ������Ҫ�Է���
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		this.isHavingBreakfast = true;
	}// �����ӿ�ʼ������

	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.isHavingFun = true;
	}// ������bean�Ļ���������getter/setter������˵

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}
}
