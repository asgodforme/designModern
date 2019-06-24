package modernDsign.daili.after.b2;

import modernDsign.daili.before.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;

	// ͨ�����캯������Ҫ��˭���д���
	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayer(this, name);
		} catch (Exception e) {
			// TODO �쳣����
		}
	}// ����ɱ��

	public void killBoss() {
		this.gamePlayer.killBoss();
	}// ������¼

	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}// ��������

	public void upgrade() {
		this.gamePlayer.upgrade();
	}
}
