package toy1;

class Data{
	int x;
}
public class Tmp1 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x = " + d.x);
		
		change(d);
		System.out.println("d.x = " + d.x);
		
		System.out.println(Aa.AS);
		System.out.println(QW.AS);
	}

	static void change(Data d) {
		d.x = 1000;
	}
}
