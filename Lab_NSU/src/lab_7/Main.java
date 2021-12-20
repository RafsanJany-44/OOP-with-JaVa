package lab_7;

public class Main {

	public static void main(String[] args) {
		Point start = new Point(2,4);
		Point end= new Point(7,9);
		Line line = new Line(start,end);
		
		System.out.println("The lentgh is: "+line.length());

	}

}
