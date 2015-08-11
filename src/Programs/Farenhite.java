package Programs;

public class Farenhite implements TemperatureQuantity{

	private double farenhite;
	
	public Farenhite(){}
	
	public Farenhite(double farenhite) {
		super();
		this.farenhite = farenhite;
	}

	@Override
	public double ToLowerMeasure() {
		
		return ((this.farenhite - 32)/1.8);
	}

	@Override
	public Object convert(Volume obj1) {
		double val=obj1.ToLowerMeasure();
		return new Farenhite(val*1.8+32);
	}

}
