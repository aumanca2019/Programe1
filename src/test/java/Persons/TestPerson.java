package Persons;


import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    @Test
    public void TestPersonClass(){
        Person person1 = new Person("Maria",34,"femeie");
        String name1 = "Maria";
        String person = person1.getName();


        Assert.assertEquals(name1,person);
    }

}
