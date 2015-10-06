package test.java;

import main.java.Person;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    private List<Person> people = new ArrayList<>();

    @Before
    public void setup() {
        createPeople();
    }

    private void createPeople() {

    }
}