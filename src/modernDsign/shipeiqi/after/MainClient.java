package modernDsign.shipeiqi.after;

import modernDsign.shipeiqi.before.IUserInfo;

/**
 * 适配器模式：
 * 将一个类的接口变换成客户端所期待的另一种接口， 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。 
 * @author Administrator
 *
 */
public class MainClient {

	public static void main(String[] args) {
//		// 没有与外系统连接的时候， 是这样写的
//		IUserInfo youngGirl = new UserInfo();
//		// 从数据库中查到101个
//		for (int i = 0; i < 101; i++) {
//			youngGirl.getMobileNumber();
//		}

		// 老板一想不对呀， 兔子不吃窝边草， 还是找借用人员好点
		// 我们只修改了这句话
		IUserInfo youngGirl = new OuterUserInfo();
		// 从数据库中查到101个
		for (int i = 0; i < 101; i++) {
			youngGirl.getMobileNumber();
		}
	}
}
