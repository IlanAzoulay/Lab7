package Lab7Package;

public class Toaster extends Product implements Cooker  {

	public Toaster(){
		
	}
//dddddd
	@Override
	public String PrepareFood() {
		
		return "Food prepared";
	}

	@Override
	public String getName() {

		return "My name is Jefffff";
	}
	
	
}
