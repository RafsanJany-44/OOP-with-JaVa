package Lab_quiz_3;

public class Pineapple extends Fruit implements Cookable {

	public Pineapple(String color, String fruitname) {
		super(color, fruitname);
		
	}



	@Override
	void taste() {
		
		System.out.println("Sour taste");
	}
	
	public String toString() {
		return "Fruit Name: "+super.getFruitname()+"Color: "+super.getColor();
		}



	@Override
	public void howToCook() {
		
		System.out.println("Cooking is possible");
	}
	

}
