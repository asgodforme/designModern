package modernDsign.daili.after.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ��̬����
 * @author Administrator
 *
 */
public class GamePlayIH implements InvocationHandler {

	// ��������
	Class cls = null;
	// �������ʵ��
	Object obj = null;
	// ��Ҫ����˭
	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
