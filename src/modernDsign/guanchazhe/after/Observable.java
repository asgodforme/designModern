package modernDsign.guanchazhe.after;

public interface Observable {

	// ����һ���۲���
	public void addObserver(Observer observer);

	// ɾ��һ���۲���
	public void deleteObserver(Observer observer);

	// ��ȻҪ�۲죬 �ҷ����ı�����ҲӦ������������ ֪ͨ�۲���
	public void notifyObservers(String context);
}
