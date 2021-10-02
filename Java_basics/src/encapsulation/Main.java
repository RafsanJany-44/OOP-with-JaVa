package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area n = new Area();
		
		n.setA(1.2);
		n.setB(3.4999);
		n.setC(3.4);
		n.calculate();
		System.out.println(n.getAns());
		
		
		Area2 n2= new Area2(1.2,123.2,242.2);
		System.out.println(n2.calculate());
		n2.a=2.33333; // data corupting 
		System.out.println("Data corupted: "+n2.calculate());
	}

}

//https://www.w3schools.com/java/java_modifiers.asp