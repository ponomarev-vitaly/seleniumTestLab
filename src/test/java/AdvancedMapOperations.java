import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedMapOperations {

    @Test
    public void streamMap() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aidan");
        names.add("Benjamin");
        names.add("Charles");
        names.add("Owen");
        names.add("Anne");
        names.add("Emma");

        // Choose&print names which have last letter "a" with Uppercase

        Stream.of("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        // Choose&print names which have first letter "a" with Uppercase and sort it
        List<String> names1 = Arrays.asList("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail");
        names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        Stream<String> newStream =Stream.concat(names.stream(), names1.stream());
        newStream.sorted().forEach(s-> System.out.println(s));



    }
}

