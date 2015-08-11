package Programs;

public class Meter implements Length{
	private double meter;

	public void meter(){}
	
	public double getMeter() {
		return meter;
	}

	public void setMeter(double meter) {
		this.meter = meter;
	}

	public Meter(double meter) {
		super();
		this.meter = meter;
	}

	@Override
	public double ToLowerMeasure() {
	ConversionFactor cf = new ConversionFactor();	
		return this.meter*cf.getMeterToCentemeter();
	}

	@Override
	public Object convert(Length obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.meter= value/(new ConversionFactor().getMeterToCentemeter());
	return this;
	}

	@Override
	public Object addition(Length obj1) {
		double value=obj1.ToLowerMeasure();
		System.out.println(this.meter+value/new ConversionFactor().getMeterToCentemeter());
		return new Meter(this.meter+value/new ConversionFactor().getMeterToCentemeter()); 
	}

	

	
	
	
}
