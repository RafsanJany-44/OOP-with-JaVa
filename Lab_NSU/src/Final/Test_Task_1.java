package Final;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test_Task_1 {

		public static void main(String[] args) {

	        List<String> list = new ArrayList<>();
	         Residents res;
	        try {
	            File file = new File("residents.txt");
	            Scanner input = new Scanner(file);
	            while(input.hasNextLine()) {
	                String l = input.nextLine();
	                String[] data = l.split(" ");
	                String name = data[0] + data[1];
	                String nid = data[2];
	                double salary = Double.parseDouble(data[3]);

	               
	                res = new Residents(name, nid, salary);
	                if(res.validateNID()) {
	                    list.add(res.makeList(name, nid, salary));
	                }

	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Zero returns persons");
	        for(String i : list) {
	            System.out.println(i);
	        }

	    }

	}


