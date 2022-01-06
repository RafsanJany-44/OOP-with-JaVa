package Final;

public class Residents implements Validate {
	private	 String name;
	private  String nid;
	private  double salary;

	public Residents(String name, String nid, double salary) {
		super();
		this.name = name;
		this.nid = nid;
		this.salary = salary;
	}

	@Override
	public boolean validateNID() {
		  if(nid.length() != 17) {
	            return false;
	        }

	        try{
	            long l = Long.parseLong(nid);
	            return true;

	        }
	        catch(Exception e) {
	            return false;
	        }
	}
    
	int getAge(String nid) {
        String age = nid.substring(0,4);
        int retAge =  2021 - Integer.parseInt(age);
        return retAge;
    }

    
	String makeList(String name, String nid, double salary) {
        if(salary <= 350000/12 || getAge(nid) >= 65) {
            return toString();
        }
        return "";
    }

    @Override
    public String toString() {
        return "Name:'" + name + ", Nid='" + nid + ", Salary=" + salary;
    }



}
