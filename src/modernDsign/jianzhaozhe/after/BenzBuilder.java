package modernDsign.jianzhaozhe.after;

import java.util.ArrayList;

import modernDsign.jianzhaozhe.before.BenzModel;
import modernDsign.jianzhaozhe.before.CarModel;

public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();

	public CarModel getCarModel() {
		return this.benz;
	}

	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}
}
