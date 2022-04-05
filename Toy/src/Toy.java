import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Toy {
    public static void main(String[] args) {
        // Supplier는 입력 X, 출력 O
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;
//        Function<Integer, MyClass> s = i -> new MyClass(i);
        Function<Integer, MyClass> s = MyClass::new;
        Function<Integer, MyClass> s1 = i -> new MyClass(i);

        Function<Integer, int[]> f = i -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;
        System.out.println(f.apply(100).length);

        HashMap<String, String> map = new HashMap<>();
        int[] arr = new int[10];
        Arrays.stream(arr);


        MyClass mc = s.apply(123);
        System.out.println(mc.i);

//        (base, exponent) -> Math.pow(base, exponent);
//        Math::pow
    }
}

class MyClass {
    int i;

    public MyClass(int i) {
        this.i = i;
    }

//    public MyClass() {
//    }
}