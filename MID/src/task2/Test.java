package task2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Surgeon surgeon1= new Surgeon("Sur",27,"Surgeon",237,"x",5);
		Surgeon surgeon2= new Surgeon("Sur2",31,"Surgeon",177,"x",7);
		
		System.out.println("Info of Surgeon 1:");
		System.out.println(surgeon1.toString());
		System.out.println("specialization: "+surgeon1.getSpecialization()+", hourlyRate: "+surgeon1.getHourlyRate());
		System.out.println("oparate: "+surgeon1.getOparate()+", timeHour:"+surgeon1.getTimeHour());
		System.out.println();
		System.out.println("Info of Surgeon 2:");
		System.out.println(surgeon2.toString());
		System.out.println("specialization: "+surgeon2.getSpecialization()+", hourlyRate: "+surgeon2.getHourlyRate());
		System.out.println("oparate: "+surgeon2.getOparate()+", timeHour:"+surgeon2.getTimeHour());
		
		
	}

}
