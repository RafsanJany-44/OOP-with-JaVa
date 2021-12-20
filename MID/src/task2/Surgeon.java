package task2;

public class Surgeon extends Doctor {
	private String oparate;
	private int timeHour;
	public Surgeon(String name, int age, String specialization, double hourlyRate, String oparate, int timeHour) {
		super(name, age, specialization, hourlyRate);
		this.oparate = oparate;
		this.timeHour = timeHour;
	}
	public String getOparate() {
		return oparate;
	}
	public void setOparate(String oparate) {
		this.oparate = oparate;
	}
	public int getTimeHour() {
		return timeHour;
	}
	public void setTimeHour(int timeHour) {
		this.timeHour = timeHour;
	}
	 public double getSalary() {
		 return timeHour*getHourlyRate();
	 }
}
