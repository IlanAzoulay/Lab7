
package Lab7Package;

public abstract class Product {

	private double price;
	abstract public String getName();
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
