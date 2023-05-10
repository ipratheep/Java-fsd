package basics;

public class Arrays {

	public static void main(String[] args) {
		int[] oneD = new int[5];
		oneD[0] = 1;
		oneD[1] = 2;
		oneD[2] = 3;
		oneD[3] = 4;
		oneD[4] = 5;
		
		for(int i=0; i <= oneD.length; i++) {
			System.out.println(oneD[i]);
		}
		
		int[][] twoD = new int[2][2];
		twoD[0][0] = 1;
		twoD[1][1] = 4;
		
		for(int i=0; i <= twoD.length; i++) {
			for(int j=0; j <= twoD.length; j++) {
				System.out.println(twoD[i][j]);
			}
		}
			
		
	}

}
