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
	}

}
