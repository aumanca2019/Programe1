package Persons;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonsStatistics {

    @Test
    public void TestVariousStatistics() {


        Person p1 = new Person("Maria", 38, "woman");
        Person p2 = new Person("Diana", 25, "woman");
        Person p3 = new Person("Dan", 49, "man");
        Person p4 = new Person("Anca", 50, "woman");
        Person p5 = new Person("George", 75, "man");
        Person p6 = new Person("Victor", 20, "man");
        Person p7 = new Person("Ana", 78, "woman");

        Person[] allPersons = new Person[]{p1, p2, p3, p4, p5, p6, p7};

        Person expected = p7;
        PersonsStatistics personsStatistics = new PersonsStatistics(allPersons);
        Person actual = personsStatistics.oldestWoman();

        Person expected2 = p5;
        Person actual2 = personsStatistics.oldestMan();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);


        int expected3 = 4;
        int actual3 = personsStatistics.womanCount();

        Assert.assertEquals(expected3,actual3);

        int expected4 = 3;
        int actual4 = personsStatistics.manCount();

        Assert.assertEquals(expected4, actual4);

        int expected5 = 47;
        int actual5 = personsStatistics.averagewomanAge();

        Assert.assertEquals(expected5,actual5);

        int expected6 = 48;
        int actual6 = personsStatistics.averagemanAge();

        Assert.assertEquals(expected6,actual6);

    }
}
