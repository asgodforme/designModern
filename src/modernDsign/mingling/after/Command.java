package modernDsign.mingling.after;

import modernDsign.mingling.before.CodeGroup;
import modernDsign.mingling.before.PageGroup;
import modernDsign.mingling.before.RequirementGroup;

public abstract class Command {

	//把三个组都定义好， 子类可以直接使用
	protected RequirementGroup rg = new RequirementGroup(); // 需求组
	protected PageGroup pg = new PageGroup(); // 美工组
	protected CodeGroup cg = new CodeGroup(); // 代码组
	
	public abstract void execute();
}
