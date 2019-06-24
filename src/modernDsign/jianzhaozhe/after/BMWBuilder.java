package modernDsign.jianzhaozhe.after;

import java.util.ArrayList;

import modernDsign.jianzhaozhe.before.BMWModel;
import modernDsign.jianzhaozhe.before.CarModel;

public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();

	public CarModel getCarModel() {
		return this.bmw;
	}

	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}
}
