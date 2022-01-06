package final2;

public class SmartPhone extends MyDevice implements Camera {
	
	private int phoneNumber;
	
	public SmartPhone(String[] networks, double price,int phoneNumber) {
		super(networks, price);
		this.phoneNumber=phoneNumber;
	}

	

	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public void takePictre() {
		System.out.println("Picture snap");
	}

	@Override
	public void takeVedio() {
		System.out.println("Video good");		
	}
	@Override
	public void portable() {
		System.out.println("On hand");
	}
	@Override
	public String toString() {
		return"Network: "+super.getNetworks()+" Price: "+super.getPrice()+ " Phone Number: "+phoneNumber;
	}
	

}
