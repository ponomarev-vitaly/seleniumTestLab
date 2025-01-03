import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamProcessingExamples {
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("James");
        names.add("Raymond");
        names.add("Joshua");
        names.add("Alexander");
        names.add("Alice");
        names.add("Anna");
        names.add("Andrea");
        names.add("Aurora");
        names.add("Abigail");
        int count = 0;

        for (int i = 0; i < names.size(); i++) {
            String actualName = names.get(i);
            if (actualName.startsWith("A")) {
                count++;
            }
        }

        System.out.println(count);
    }

    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("James");
        names.add("Raymond");
        names.add("Joshua");
        names.add("Alexander");
        names.add("Alice");
        names.add("Anna");
        names.add("Andrea");
        names.add("Aurora");
        names.add("Abigail");

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        long d = Stream.of("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail").filter(s -> {
            s.startsWith("A");
            return false;

        }).count();

        System.out.println(d);

        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println());

    }
}
