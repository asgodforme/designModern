package modernDsign.diedaiqi.after;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	// ���е���Ŀ������ArrayList��
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;

	// ���캯������projectList
	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}// �ж��Ƿ���Ԫ�أ�����ʵ��

	public boolean hasNext() {
		// ����һ������ֵ
		boolean b = true;
		if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
			b = false;
		}
		return b;

	}// ȡ����һ��ֵ

	public IProject next() {
		return (IProject) this.projectList.get(this.currentItem++);
	}// ɾ��һ������

	public void remove() {
		// ��ʱû��ʹ�õ�
	}

}