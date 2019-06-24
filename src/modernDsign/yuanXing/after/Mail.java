package modernDsign.yuanXing.after;

import modernDsign.yuanXing.before.AdvTemplate;

/**
 * 原型模式： 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 
 * 
 * 翻开JDK的帮助看看Cloneable是一个方法都没有的， 这个接口只是一个标记作用， 在JVM中具有这个标记
的对象才有可能被拷贝。 那怎么才能从“有可能被拷贝”转换为“可以被拷贝”呢？ 方法是覆盖
clone()方法， 是的， 你没有看错是重写clone()方法， 看看我们上面Mail类中的clone方法， 如
代码清单13-6所示。

优点
性能优良
原型模式是在内存二进制流的拷贝， 要比直接new一个对象性能好很多， 特别是要在一
个循环体内产生大量的对象时， 原型模式可以更好地体现其优点。
逃避构造函数的约束
这既是它的优点也是缺点， 直接在内存中拷贝， 构造函数是不会执行的（参见13.4
节） 。 优点就是减少了约束， 缺点也是减少了约束， 需要大家在实际应用时考虑


Object类提供
的方法clone只是拷贝本对象， 其对象内部的数组、 引用对象等都不拷贝， 还是指向原生对象
的内部元素地址， 这种拷贝就叫做浅拷贝。
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

	// 收件人
	private String receiver;
	// 邮件名称
	private String subject;
	// 称谓
	private String appellation;
	// 邮件内容
	private String contxt;
	// 邮件的尾部， 一般都是加上"XXX版权所有"等信息
	private String tail;

	// 构造函数
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
