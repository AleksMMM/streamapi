package streamTest;

import beans.Car;
import beans.Person;
import mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class FileOnObjectTest {

    @Test
    void listsCar() throws IOException {
        List<Car> cars = Mock.getCars();
        cars.forEach(System.out::println);
    }

    @Test
    void listsPerson() throws IOException {
        List<Person> person = Mock.getPeople();
        person.forEach(System.out::println);
    }
}
