import java.io.File;
import java.util.Locale;
import java.util.stream.Stream;


public class Toy {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
        new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        //map()으로 Stream<File>을 Stream으로 변환
        Stream<String> stringStream = fileStream.map(f -> f.getName());
        stringStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);
        fileStream.map(f -> f.getName()).filter(s -> s.indexOf('.') != -1)
                .map(s -> s.substring(s.indexOf('.') + 1))
                .peek(s -> System.out.printf("filename=%s%n", s))
                .map(s -> s.toUpperCase(Locale.ROOT))
                .distinct()
                .forEach(System.out::print);
    }
}
