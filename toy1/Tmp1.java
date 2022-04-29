package toy1;

public class Tmp1 {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		for(int i = 0; i <= 8; i++) {
			for(int j = 0; j <= 8; j++) {
				arr[i][j] = j+1;
			}
		}
		
		System.out.println(arr[3][3] * arr[3][4]);
	}

}
