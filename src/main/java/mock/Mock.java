package mock;

import beans.Car;
import beans.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mock {

    public static List<Person> getPeople() throws IOException {

        List<Person> personList = new ObjectMapper().readValue(new File("src/main/resources/people.json"), new TypeReference<List<Person>>() {
        });
        return personList;
    }

    public static List<Car> getCars() throws IOException {

        List<Car> carList = new ObjectMapper()
                .readValue(new File("src/main/resources/car.json"), new TypeReference<List<Car>>() {});
        return carList;

    }

}
