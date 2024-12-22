import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedMapOperations {

    @Test
    public void streamMap() {
        // Choose&print names which have last letter "a" with Uppercase

        Stream.of("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        // Choose&print names which have first letter "a" with Uppercase and sort it
        List<String> names = Arrays.asList("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail");
        names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));


    }

}

