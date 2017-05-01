package Lab7Package;

public class Laptop extends Product implements Networked, DataStorage{

	private double totalCapacity;
	
	private double usedCapacity;

	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		
		if (usedCapacity!=0 && usedCapacity>0)
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		if (usedCapacity!=0 && usedCapacity>0)
		this.usedCapacity = usedCapacity;
	}

	@Override
	public String getName() {
		return "Wow";
	}

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public double maxSpeed() {
		return 3467;
	}
	
	public Laptop(){
		totalCapacity=1234;
		usedCapacity=643;
	}
	
	public double getFreeCapacity(){
		return 200;
	}
	
	public void format(){
		usedCapacity=0;
		System.out.println("Used Capacity = 0");
	}
	

	

}
