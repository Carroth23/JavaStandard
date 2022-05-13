package aToy;

public class Hello {

	public static void main(String[] args) {
		A a = new A();
		a.mea(new C());
	}
}

class A {
	public void mea(I i) {
		i.met();
	}
}

class B implements I{
	public void met() {
		System.out.println("메서드비");
	}
}

class C implements I {
	public void met() {
		System.out.println("메서드씨");
	}
}

interface I {
	void met();
}

