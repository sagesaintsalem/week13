import java.util.stream.Stream;

public class MoreStreams {

    public static void main(String[]args) {
        Stream.of(1, 2, 3, 4, 5)
                .filter(num -> num%2 == 0)
                .forEach(System.out::println);

        System.out.println("-------");

        Stream.of(2, 7, 4, 9, 3)
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------");

        Stream.of("eat", "these", "cookies")
                .limit(2)
                .forEach(System.out::println);

        System.out.println("-------");

        double avg = Stream.of(45, 67, 122, 986, 3, 109)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        System.out.println("-------");

        int max = Stream.of(45, 67, 122, 986, 3, 109)
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        System.out.println(max);

        System.out.println("-------");

        Stream.of("frogs")
                .peek(val -> System.out.println("Value was " + val))
                .map(String :: toUpperCase)
                .peek(val -> System.out.println("Value is now " + val));

    }
}
