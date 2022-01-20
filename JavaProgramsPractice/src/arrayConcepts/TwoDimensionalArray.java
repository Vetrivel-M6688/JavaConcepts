package arrayConcepts;

public class TwoDimensionalArray {

	public void twoD1() {
		int[][] arr = new int[3][2];
						// [0-2][0-1]
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[2][0] = 60;
		arr[2][1] = 70;

		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void twoD2() {
		int[][] brr = new int[4][4];
						// [0-3][0-3]
		
		brr[0][0] = 10;
		brr[0][1] = 20;
		brr[0][2] = 30;
		brr[0][3] = 40;
		brr[1][0] = 50;
		brr[1][1] = 60;
		brr[1][2] = 70;
		brr[1][3] = 80;
		brr[2][0] = 90;
		brr[2][1] = 100;
		brr[2][2] = 111;
		brr[2][3] = 103;
		brr[3][0] = 105;
		brr[3][1] = 106;
		brr[3][2] = 109;
		brr[3][3] = 106;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		TwoDimensionalArray tda = new TwoDimensionalArray();
		tda.twoD2();
	}

}
