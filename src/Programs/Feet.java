package Programs;

public class Feet implements Length{

	private double feet;

	
	public Feet(){}
	
	public Feet(double feet) {
		super();
		this.feet = feet;
	}

	@Override
	public double ToLowerMeasure() {
		
		return this.feet*new ConversionFactor().getFeetToCm();
	}

	@Override
	public Object convert(Length obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.feet=value/(new ConversionFactor().getFeetToCm());	
	return this;}

	@Override
	public Object addition(Length obj1) {
		double value=obj1.ToLowerMeasure();
		//System.out.println(this.feet+value/new ConversionFactor().getFeetToCm());
		return new Feet(this.feet+value/new ConversionFactor().getFeetToCm()); 
	}

	

	
	
}
