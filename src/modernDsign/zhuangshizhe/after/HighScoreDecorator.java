package modernDsign.zhuangshizhe.after;

import modernDsign.zhuangshizhe.before.SchoolReport;

public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	// ��Ҫ�㱨��߳ɼ�
	private void reportHighScore() {
		System.out.println("��ο������������75�� ��ѧ��78�� ��Ȼ��80");
	}// ��Ҫ���ϰֿ��ɼ���ǰ��������߳ɼ����������һ����������ɨ�����ң������ﻹ�л���˵��

	@Override
	public void report() {
		this.reportHighScore();
		super.report();
	}

}
