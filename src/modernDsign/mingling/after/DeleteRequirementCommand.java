package modernDsign.mingling.after;

public class DeleteRequirementCommand extends Command {

	@Override
	public void execute() {
		// �ҵ�ҳ����
		super.pg.find();
		// ɾ��һ��ҳ��
		super.rg.delete();
		// �����ƻ�
		super.rg.plan();
	}

}
