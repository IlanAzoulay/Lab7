package Lab7Package;

public class ProductTest {
 
	public static void main(String[] args) {
		ProductTest pt=new ProductTest();
		Product p=new SmartTV();
		DataStorage d=new Laptop();
		pt.testProduct(p);
		pt.testDataStorage(d);
	}

	public void testProduct(Product p)
	{
		System.out.println("Price : "+p.getPrice());
		System.out.println("Product Name : "+p.getName());
	}
	
	public void testDataStorage(DataStorage d)
	{
		System.out.println("Free Capacity : "+d.getFreeCapacity());
		d.format();
	}
}
