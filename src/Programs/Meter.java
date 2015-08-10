package Programs;

public class Meter implements Quantity{
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
	public double ToCentimeter() {
	ConversionFactor cf = new ConversionFactor();	
		return this.meter*cf.getMeterToCentemeter();
	}

	@Override
	public Object convert(Quantity obj1) {
		double value=obj1.ToCentimeter();
		
		this.meter= value/(new ConversionFactor().getMeterToCentemeter());
	return this;
	}

	@Override
	public Object addition(Quantity obj1) {
		double value=obj1.ToCentimeter();
		System.out.println(this.meter+value/new ConversionFactor().getMeterToCentemeter());
		return new Meter(this.meter+value/new ConversionFactor().getMeterToCentemeter()); 
	}
	
	
}
