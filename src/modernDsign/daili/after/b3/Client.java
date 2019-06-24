package modernDsign.daili.after.b3;

/**
 * 强制代理：强制代理的概念就是要从真实角色查找到代理角色， 不允
许直接访问真实角色。 
 * 
 * 一个类可以实现多个接口， 完成不同任务的整合。 也就是说代理类不仅仅可以实现主题 接口， 也可以实现其他接口完成不同的任务，
 * 而且代理的目的是在目标对象方法的基础上作增强， 这种增强的本质通常就是对目标对象的方法进行拦截和过滤。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 定义一个游戏的角色
		IGamePlayer player = new GamePlayer("张三").getProxy();
		// 开始打游戏， 记下时间戳
		System.out.println("开始时间是： 2009-8-25 10:45");
		player.login("zhangSan", "password");
		// 开始杀怪
		player.killBoss();
		// 升级
		player.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是： 2009-8-26 03:40");
	}

}
