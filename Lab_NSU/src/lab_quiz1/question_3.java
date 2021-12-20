package lab_quiz1;
import java.util.*;
public class question_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		int arr[]=new int[10] ;
		for(int i=0;i<10;i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]+" "+frequencyOfNum(arr, 10, arr[i]));
		}

	}
	
	public static int frequencyOfNum(int [] arr, int size, int elem) {
		
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i]==elem) {
				count++;
			}
		}
		return count;
		
	}

}
