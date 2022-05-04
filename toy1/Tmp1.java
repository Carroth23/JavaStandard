package toy1;

class Data{
	int x;
}
public class Tmp1 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x = " + d.x);
		
		change(d);
		System.out.println("d.x = " + d.x);
		
		System.out.println(Aa.AS);
		System.out.println(QW.AS);
		
=======
		int[][] arr = new int[9][9];
		for(int i = 0; i <= 8; i++) {
			for(int j = 0; j <= 8; j++) {
				arr[i][j] = j+1;
			}
		}
		
		System.out.println(arr[3][3] * arr[3][4]);
>>>>>>> 9591609f3ce21e7a9ecc874ce2dba6ecc6694a87
	}

	static void change(Data d) {
		d.x = 1000;
	}
}
