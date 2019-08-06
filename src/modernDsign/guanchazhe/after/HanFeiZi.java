package modernDsign.guanchazhe.after;

import java.util.ArrayList;
import java.util.List;


public class HanFeiZi implements Observable, IHanFeiZi {

	// ������䳤���飬 ������еĹ۲���
	private List<Observer> observerList = new ArrayList<Observer>();

	// ���ӹ۲���
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}// ɾ���۲���

	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}// ֪ͨ���еĹ۲���

	public void notifyObservers(String context) {
		for (Observer observer : observerList) {
			observer.update(context);
		}
	}// ������Ҫ�Է���

	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		// ֪ͨ���еĹ۲���
		this.notifyObservers("�������ڳԷ�");
	}// �����ӿ�ʼ������

	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.notifyObservers("������������");
	}
}
