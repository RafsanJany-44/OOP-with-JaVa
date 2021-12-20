package task2;

public class Doctor extends Person {
	
	private String specialization;
	private double hourlyRate;
	
	public Doctor(String name, int age, String specialization, double hourlyRate) {
		super(name, age);
		this.specialization = specialization;
		this.hourlyRate = hourlyRate;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	

}
