import java.io.File;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;


public class Toy {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(0);

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        Optional.of("456").map(Integer::parseInt)
                .ifPresent(System.out::println);
    }
}
