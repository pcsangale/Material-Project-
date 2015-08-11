package Programs;

public class DegreeCelsius implements TemperatureQuantity{

	private double temperature;
	
	public DegreeCelsius(){}
	
	public DegreeCelsius(double temperature) {
		super();
		this.temperature = temperature;
	}

	@Override
	public double ToLowerMeasure() {
		
		return this.temperature;
	}

	@Override
	public Object convert(Volume obj1) {
	double val= obj1.ToLowerMeasure();
		return new DegreeCelsius(val);
	}
	
}
