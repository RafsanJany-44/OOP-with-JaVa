package Lab_3;

public class Task_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row_num=5;
		int col_num=5;
		int space=row_num-1;
		
		for(int row=1;row<=row_num;row++)
		{
			for(int col=1; col<=space;col++){
				System.out.print(" ");
			}
			space--;
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");	
			}
			System.out.println();
		}
	}

}
