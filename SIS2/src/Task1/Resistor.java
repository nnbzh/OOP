package Task1;

public class Resistor extends Circuit{
	private double resistance;
	private double voltage;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	@Override
	public double getResistance() {
		return resistance;
	}

	@Override
	public double getPotentialDiff() {
		return voltage;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.voltage = V;
	}
	
}
