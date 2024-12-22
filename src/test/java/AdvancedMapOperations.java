import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class AdvancedMapOperations {

    @Test
    public void streamMap() {
        // Choose&print names which have last letter "a" with Uppercase

        Stream.of("James", "Raymond", "Joshua", "Alexander", "Alice", "Anna", "Andrea", "Aurora", "Abigail")
                .filter(s->s.endsWith("a"))
                .map(s->s.toUpperCase());


    }

}

