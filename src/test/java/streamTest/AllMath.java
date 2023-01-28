package streamTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AllMath {

    @Test
    void allMath() {
        int[] even = {1, 2, 3, 4, 5, 6};
        boolean b = Arrays.stream(even).allMatch(v -> v % 2 == 0);
        System.out.println(b);
    }

    @Test
    void anyMath() {
        int[] even = {1, 11, 3, 4, 5, 6};
        boolean b = Arrays.stream(even).anyMatch(v -> !(v % 2 == 0));
        System.out.println(b);
    }
}
