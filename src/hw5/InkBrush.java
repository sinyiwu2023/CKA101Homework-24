package hw5;

public class InkBrush extends Pen {

	@Override
	public void write() {
		System.out.println("沾墨水再寫");
		
	}
	
	public double getPrice() {
		return super.getPrice()*0.9;
	
	}
	
	public InkBrush(String brand, double price) {
	    super(brand, price); 
	}

}
