package modernDsign.daili.after.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * @author Administrator
 *
 */
public class GamePlayIH implements InvocationHandler {

	// 被代理者
	Class cls = null;
	// 被代理的实例
	Object obj = null;
	// 我要代理谁
	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
