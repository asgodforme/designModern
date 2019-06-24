package modernDsign.zhuangshizhe.after;

import modernDsign.zhuangshizhe.before.FouthGradeSchoolReport;
import modernDsign.zhuangshizhe.before.SchoolReport;

/**
 * 装饰者模式：
 * 动态地给一个对象添加一些额外的职责。
就增加功能来说， 装饰模式相比生成子类更为灵活。
 * @author Administrator
 *
 */
public class Father {

	public static void main(String[] args) {
		// 把成绩单拿过来
		SchoolReport sr;
		// 原装的成绩单
		sr = new FouthGradeSchoolReport();
		// 加了最高分说明的成绩单
		sr = new HighScoreDecorator(sr);
		// 又加了成绩排名的说明
		sr = new SortDecorator(sr);
		// 看成绩单
		sr.report();
		// 然后老爸一看， 很开心， 就签名了
		sr.sign("老三"); // 我叫小三， 老爸当然叫老三
	}
}
