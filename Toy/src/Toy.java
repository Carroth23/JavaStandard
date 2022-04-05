import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
}

public class Toy {
    static void execute(MyFunction f) { // 매개변수 타입이 펑셔날
        f.run();
    }

    static MyFunction getMyFunction() {
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) throws Exception {
        // 람다로 구현
        MyFunction f = () -> System.out.println("f1.run()");

        getMyFunction().run();
        execute(() -> System.out.println("execute"));

    }

}
