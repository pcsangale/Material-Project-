package Programs;

public class Feet implements Quantity{

	private double feet;

	
	public Feet(){}
	
	public Feet(double feet) {
		super();
		this.feet = feet;
	}

	@Override
	public double ToCentimeter() {
		
		return this.feet*new ConversionFactor().getFeetToCm();
	}

	@Override
	public Object convert(Quantity obj1) {
		double value=obj1.ToCentimeter();
		
		this.feet=value/(new ConversionFactor().getFeetToCm());	
	return this;}

	@Override
	public Object addition(Quantity obj1) {
		double value=obj1.ToCentimeter();
		//System.out.println(this.feet+value/new ConversionFactor().getFeetToCm());
		return new Feet(this.feet+value/new ConversionFactor().getFeetToCm()); 
	}
	
	
}
