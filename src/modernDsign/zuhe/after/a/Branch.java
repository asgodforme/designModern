package modernDsign.zuhe.after.a;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp {
	// 领导下边有哪些下级领导和小兵
	List<Corp> subordinateList = new ArrayList<Corp>();

	// 构造函数是必需的
	public Branch(String _name, String _position, int _salary) {
		super(_name, _position, _salary);
	}// 增加一个下属，可能是小头目，也可能是个小兵

	public void addSubordinate(Corp corp) {
		this.subordinateList.add(corp);
	}// 我有哪些下属

	public List<Corp> getSubordinate() {
		return this.subordinateList;
	}
}
