package modernDsign.diedaiqi.before;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ����һ��List�� ������е���Ŀ����
		ArrayList<IProject> projectList = new ArrayList<IProject>();
		// ���������ս��Ŀ
		projectList.add(new Project("�����ս��Ŀ", 10, 100000));
		// ����Ťתʱ����Ŀ
		projectList.add(new Project("Ťתʱ����Ŀ", 100, 10000000));
		// ���ӳ��˸�����Ŀ
		projectList.add(new Project("���˸�����Ŀ", 10000, 1000000000));
		// ���100����Ŀ
		for (int i = 4; i < 104; i++) {
			projectList.add(new Project("��" + i + "����Ŀ", i * 5, i * 1000));
		}
		// ����һ��ArrayList�� �����е����ݶ�ȡ��
		for (IProject project : projectList) {
			System.out.println(project.getProjectInfo());
		}
	}
}
