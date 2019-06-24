package modernDsign.daili.after;

import modernDsign.daili.before.GamePlayer;
import modernDsign.daili.before.IGamePlayer;

/**
 * 
 * 代理模式：
 * 
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 
 * 
 * ● 职责清晰
真实的角色就是实现实际的业务逻辑， 不用关心其他非本职责的事务， 通过后期的代理
完成一件事务， 附带的结果就是编程简洁清晰。
● 高扩展性
具体主题角色是随时都会发生变化的， 只要它实现了接口， 甭管它如何变化， 都逃不脱
如来佛的手掌（接口） ， 那我们的代理类完全就可以在不做任何修改的情况下使用。
● 智能化
这在我们以上的讲解中还没有体现出来， 不过在我们以下的动态代理章节中你就会看到
代理的智能化有兴趣的读者也可以看看Struts是如何把表单元素映射到对象上的。
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// 定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		// 然后再定义一个代练者
		IGamePlayer proxy = new GamePlayProxy(player);
		// 开始打游戏， 记下时间戳
		System.out.println("开始时间是： 2009-8-25 10:45");
		proxy.login("zhangSan", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是： 2009-8-26 03:40");
	}
}
