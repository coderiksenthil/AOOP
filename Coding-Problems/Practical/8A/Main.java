import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));
        System.out.println(strings);
    }
}