package aToy;

public class Hello {

	public static void main(String[] args) {
		Q q = new Q();
		W w = new W();
		if(q instanceof W) {
			System.out.println("가능");
		}
	}
}

class Q{
	int a = 10;
}

class W extends Q{
	int b = 20;
}
