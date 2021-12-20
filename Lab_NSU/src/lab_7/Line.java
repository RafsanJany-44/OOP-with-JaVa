package lab_7;

public class Line {
	private Point start;
	private Point end;
	
	public Line(Point start, Point end) {
		this.start=start;
		this.end=end;
	}
	
	public Line(int x1,int y1,int x2,int y2){
		start.setX(x1);
		start.setX(x2);
		end.setY(y1);
		end.setY(y2);
	}
	
	public void setStart() {
		this.start=start;
	}
	
	public void setEnd() {
		this.end=end;
	}
	
	
	public Point getStart() {
		return start;
	}
	
	public Point getEnd() {
		return end;
	}
	
	public double length() {
		return start.distance(end);
	}
	
	
	

}
