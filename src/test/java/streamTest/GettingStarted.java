package streamTest;

import beans.Person;
import mock.Mock;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        List<Person> people = Mock.getPeople();

        List<Person> collect = people.stream().filter(p -> p.getAge().equals(18)).collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println();

        List<Person> collect1 = people.stream().limit(10).collect(Collectors.toList());
        collect1.forEach(System.out::println);


    }
}
