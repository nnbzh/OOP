package Task1;

public class Parallel extends Circuit{
	private Circuit a;
	private Circuit b;
	
	public Parallel(Circuit a, Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getResistance() {
		return 1/(1/a.getResistance() + 1/b.getResistance());
	}

	@Override
	public double getPotentialDiff() {
		return a.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiff(double V) {
		a.applyPotentialDiff(V);
		b.applyPotentialDiff(V);
	}

}
