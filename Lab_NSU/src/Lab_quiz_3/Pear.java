package Lab_quiz_3;

public class Pear extends Fruit implements Cookable {

	public Pear(String color, String fruitname) {
		super(color, fruitname);
	}

	@Override
	public void howToCook() {
		System.out.println("Cannot cook");
		
	}

	@Override
	void taste() {
		System.out.println("Sweet taste");
		
	}
	
	public String toString() {
		return "Fruit Name: "+super.getFruitname()+"Color: "+super.getColor();
	}



	
	
	
	
}
