package modernDsign.daili.after;

import modernDsign.daili.before.IGamePlayer;

public class GamePlayProxy implements IGamePlayer, IProxy {

	private IGamePlayer gamePlayer = null;

	// ͨ�����캯������Ҫ��˭���д���
	public GamePlayProxy(IGamePlayer _gamePlayer) {
		this.gamePlayer = _gamePlayer;
	}// ����ɱ��

	public void killBoss() {
		this.gamePlayer.killBoss();
	}// ������¼

	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}// ��������

	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}

	@Override
	public void count() {
		System.out.println("�����ܷ����ǣ� 150Ԫ");
	}

}
