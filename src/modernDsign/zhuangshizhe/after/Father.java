package modernDsign.zhuangshizhe.after;

import modernDsign.zhuangshizhe.before.FouthGradeSchoolReport;
import modernDsign.zhuangshizhe.before.SchoolReport;

/**
 * װ����ģʽ��
 * ��̬�ظ�һ���������һЩ�����ְ��
�����ӹ�����˵�� װ��ģʽ������������Ϊ��
 * @author Administrator
 *
 */
public class Father {

	public static void main(String[] args) {
		// �ѳɼ����ù���
		SchoolReport sr;
		// ԭװ�ĳɼ���
		sr = new FouthGradeSchoolReport();
		// ������߷�˵���ĳɼ���
		sr = new HighScoreDecorator(sr);
		// �ּ��˳ɼ�������˵��
		sr = new SortDecorator(sr);
		// ���ɼ���
		sr.report();
		// Ȼ���ϰ�һ���� �ܿ��ģ� ��ǩ����
		sr.sign("����"); // �ҽ�С���� �ϰֵ�Ȼ������
	}
}
