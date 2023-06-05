
public class SwastikaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		int cols=7;
		for(int i=0;i<rows/2;i++) {
			for(int j = 0;j<cols;j++) {
				if(i ==0 && j > cols/2) {
					System.out.print("*");	
				}
				else if(j == 0 || j==cols/2) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		for(int i=rows/2;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				if(i == rows/2) {
					System.out.print("*");	
				}
				else if(i == rows-1 && j < cols/2) {
					System.out.print("*");	
				}
				else if (j == cols-1 || j == cols / 2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");	
				}
				
			}
			System.out.println();
		}
	}

}
