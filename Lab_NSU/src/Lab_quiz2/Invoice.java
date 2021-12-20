package Lab_quiz2;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	Date date;
	public Invoice(String partNumber, String partDescription, int quantity, double price, Date date) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double getInvoiceAmount() {
		   return quantity * price; 
		    
	}
	
	public String toString() {
		return  partNumber+","+partDescription+","+quantity+","+price;
	}
	
}
