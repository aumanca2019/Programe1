package ClassesAndObjects;

import org.junit.Assert;
import org.junit.Test;

public class TestEmployee {

   @Test
    public void TestEmployeeClass(){
        Employee emp1 = new Employee("James",46,"Engineer",1500);

        String expected1 = "James";
        String actual1 = emp1.getName();


        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(46,emp1.getAge());
        Assert.assertEquals("Engineer",emp1.getJobTitle());
        Assert.assertEquals(1500,emp1.getSalary(),0.1);
    }
}
