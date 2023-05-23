
public class KPattern {

	public static void main(String[] args) {
		int rows = 7;
		int cols =5;
		int revcols=1;
		for(int i=0;i<rows/2;i++)
		{
			for(int j=0;j==0;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=cols-1;k++) 
			{
				if(k==cols-1)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			cols--;
			System.out.println();
		}
		for(int i=rows/2;i<rows;i++)
		{
			for(int j=0;j==0;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=revcols;k++) 
			{
				if(k==revcols)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			revcols++;
			System.out.println();
		}
	}

}
