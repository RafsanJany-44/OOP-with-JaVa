package Assigment_1_RJP;

public class RoboGrid {
	public static int MX=100;
	public static int MY=100;
	private int cur_x;
	private int cur_y;
	private String name;
	
	public RoboGrid(){
		name="Nimo";
		cur_x=0;
		cur_y=0;
	}
	
	public RoboGrid(String name, int x,int y) {
		cur_x=x;
		cur_y=y;
		this.name=name;
	}
	
	public boolean setPos(int x, int y){
		if (x>MX || y>MY) {
			return false;
		}
		else {
		cur_x=x;
		cur_y=y;
		return true;
		}
	}
	
	public int getX() {
		return cur_x;
	}
	
	public int getY() {
		return cur_y;
	}
	
	public boolean moveRight(int z) {
		if (z>MX || (cur_x+z)>MX) {
			return false;
		}
		else {
			cur_x=cur_x+z;
			return true;
		}
	}
	
	public boolean moveRight() {
		if ((cur_x+1)>MX) {
			return false;
		}
		else {
			cur_x=cur_x+1;
			return true;
		}
	}
	
	public boolean moveUp(int z) {
		if (z>MY || (cur_x+z)>MY) {
			return false;
		}
		else {
			cur_y=cur_y+z;
			return true;
		}
	}
	@Override
	public String toString() {
		return "The robot "+name+"is at ("+cur_x+","+cur_y+")";
	}

}
