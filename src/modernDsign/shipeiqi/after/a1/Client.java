package modernDsign.shipeiqi.after.a1;

import modernDsign.shipeiqi.before.IUserInfo;

/**
 * ����������
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		//��ϵͳ����Ա��Ϣ
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		//������������
		IUserInfo youngGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
		//�����ݿ��в鵽101��
		for(int i=0;i<101;i++){
		youngGirl.getMobileNumber();
		}
		}
}
