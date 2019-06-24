package modernDsign.yuanXing.after;

import modernDsign.yuanXing.before.AdvTemplate;

/**
 * ԭ��ģʽ�� ��ԭ��ʵ��ָ��������������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * 
 * 
 * ����JDK�İ�������Cloneable��һ��������û�еģ� ����ӿ�ֻ��һ��������ã� ��JVM�о���������
�Ķ�����п��ܱ������� ����ô���ܴӡ��п��ܱ�������ת��Ϊ�����Ա��������أ� �����Ǹ���
clone()������ �ǵģ� ��û�п�������дclone()������ ������������Mail���е�clone������ ��
�����嵥13-6��ʾ��

�ŵ�
��������
ԭ��ģʽ�����ڴ���������Ŀ����� Ҫ��ֱ��newһ���������ܺúܶ࣬ �ر���Ҫ��һ
��ѭ�����ڲ��������Ķ���ʱ�� ԭ��ģʽ���Ը��õ��������ŵ㡣
�ӱܹ��캯����Լ��
����������ŵ�Ҳ��ȱ�㣬 ֱ�����ڴ��п����� ���캯���ǲ���ִ�еģ��μ�13.4
�ڣ� �� �ŵ���Ǽ�����Լ���� ȱ��Ҳ�Ǽ�����Լ���� ��Ҫ�����ʵ��Ӧ��ʱ����


Object���ṩ
�ķ���cloneֻ�ǿ��������� ������ڲ������顢 ���ö���ȶ��������� ����ָ��ԭ������
���ڲ�Ԫ�ص�ַ�� ���ֿ����ͽ���ǳ������
 * 
 * @author Administrator
 *
 */
public class Mail implements Cloneable {

	@Override
	protected Mail clone() throws CloneNotSupportedException {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	// �ռ���
	private String receiver;
	// �ʼ�����
	private String subject;
	// ��ν
	private String appellation;
	// �ʼ�����
	private String contxt;
	// �ʼ���β���� һ�㶼�Ǽ���"XXX��Ȩ����"����Ϣ
	private String tail;

	// ���캯��
	public Mail(AdvTemplate advTemplate) {
		this.contxt = advTemplate.getAdvContext();
		this.subject = advTemplate.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContxt() {
		return contxt;
	}

	public void setContxt(String contxt) {
		this.contxt = contxt;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

}
