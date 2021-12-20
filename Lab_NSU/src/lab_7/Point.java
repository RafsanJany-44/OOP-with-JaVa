package lab_7;

public class Point {
	
	private static int x;
	private static int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point() {}
	
	public void setX(int x) {
		this.x= x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distance(Point point) {
		return Math.sqrt(Math.pow((this.x-point.x), (2))+Math.pow((this.y-point.y),(2)));
		
	}
	
	@Override
	public String toString() {
		return "Point("+"x="+x+",y="+y+")";
	}
	

}
