package streamTest;

import beans.Car;
import mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    @Test
    void filter() throws IOException {
        List<Car> cars = Mock.getCars();
        List<Car> yellow = cars.stream()
                .filter(c -> c.getPrice() > 20000)
                .filter(c -> c.getColor().equals("Yellow"))
                .collect(Collectors.toList());

        yellow.forEach(System.out::println);


    }
}
