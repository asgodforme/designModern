package modernDsign.mingling.after;

import modernDsign.mingling.before.CodeGroup;
import modernDsign.mingling.before.PageGroup;
import modernDsign.mingling.before.RequirementGroup;

public abstract class Command {

	//�������鶼����ã� �������ֱ��ʹ��
	protected RequirementGroup rg = new RequirementGroup(); // ������
	protected PageGroup pg = new PageGroup(); // ������
	protected CodeGroup cg = new CodeGroup(); // ������
	
	public abstract void execute();
}
