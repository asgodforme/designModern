package modernDsign.jianzhaozhe.after;

import java.util.ArrayList;

import modernDsign.jianzhaozhe.before.CarModel;

public abstract class CarBuilder {

	// ����һ��ģ�ͣ� ��Ҫ����һ��˳��Ҫ�� ������װ˳��
	public abstract void setSequence(ArrayList<String> sequence);

	// �������˳��� �Ϳ���ֱ���õ��������ģ��
	public abstract CarModel getCarModel();
}
