package modernDsign.shipeiqi.after;

import modernDsign.shipeiqi.before.IUserInfo;

/**
 * ������ģʽ��
 * ��һ����Ľӿڱ任�ɿͻ������ڴ�����һ�ֽӿڣ� �Ӷ�ʹԭ����ӿڲ�ƥ����޷���һ�������������ܹ���һ������ 
 * @author Administrator
 *
 */
public class MainClient {

	public static void main(String[] args) {
//		// û������ϵͳ���ӵ�ʱ�� ������д��
//		IUserInfo youngGirl = new UserInfo();
//		// �����ݿ��в鵽101��
//		for (int i = 0; i < 101; i++) {
//			youngGirl.getMobileNumber();
//		}

		// �ϰ�һ�벻��ѽ�� ���Ӳ����ѱ߲ݣ� �����ҽ�����Ա�õ�
		// ����ֻ�޸�����仰
		IUserInfo youngGirl = new OuterUserInfo();
		// �����ݿ��в鵽101��
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}
}
