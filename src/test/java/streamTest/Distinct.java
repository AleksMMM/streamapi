package streamTest;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Distinct {

    @Test
    public void disc() {
        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 10, 10, 5, 5, 5);

        List<Integer> collect = numb.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> integerSet = new HashSet<>(numb);
        System.out.println();
        System.out.println(integerSet);

    }
}
