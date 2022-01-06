package final2;

public class Laptop extends MyDevice implements Camera{
	private String eMail;
	
	public Laptop(String[] networks, double price, String eMail) {
		super(networks, price);
		this.eMail=eMail;
	}

	

	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	@Override
	public void takePictre() {
		System.out.println("Picture is taken");
		
	}

	@Override
	public void takeVedio() {
		System.out.println("Vedio is best");
		
	}
	@Override
	public void portable() {
		System.out.println("On Lap");
	}
	@Override
	public String toString() {
		return"Network: "+super.getNetworks()+" Price: "+super.getPrice()+ " E mail: "+eMail;
	}
	

}
