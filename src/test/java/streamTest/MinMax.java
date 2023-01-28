package streamTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    @Test
    public void min() {
        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 10);
        Integer integer = numb.stream().min(Integer::compareTo).get();
        System.out.println(integer);

    }

    @Test
    public void max() {
        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 10);
        Integer integer = numb.stream().max(Integer::compareTo).get();
        System.out.println(integer);

    }
}
