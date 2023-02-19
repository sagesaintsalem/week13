import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static int addTwo(int input){
        return input +2;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jimothy", "Lenjamin", "Danathan");

        names.stream()
                .map(String :: toUpperCase)
                .forEach(name -> System.out.println(name));

        Stream<String> colours = Stream.of("Pink", "Red", "Orange", "Yellow");

        colours.map(String::toLowerCase).forEach(colour -> System.out.println(colour));

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
//                .map(Streams::addTwo);
        int total = intStream.reduce(0,(sum, nextNum) -> sum+ nextNum);

//        int otherTotal = intStream.reduce(0, Integer::sum);

        System.out.println(total);
    }
}
