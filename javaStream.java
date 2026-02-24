import java.util.*;

public class javaStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 8, 3, 10);

        list.stream()
            .filter(n -> n % 2 == 0)     // even numbers
            .map(n -> n * 2)            // multiply by 2
            .sorted()                   // sort
            .forEach(System.out::println);
    }
}