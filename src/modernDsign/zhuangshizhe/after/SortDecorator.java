package modernDsign.zhuangshizhe.after;

import modernDsign.zhuangshizhe.before.SchoolReport;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	// �����ϰ�ѧУ���������
	private void reportSort() {
		System.out.println("����������38��...");
	} 
	
	// �ϰֿ���ɼ������ٸ������� ��ǿ����
	@Override
	public void report() {
		super.report();
		this.reportSort();
	}

}
