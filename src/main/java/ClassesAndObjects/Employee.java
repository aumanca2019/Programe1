package ClassesAndObjects;

public class Employee {
    String name;
    int age;
    String jobTitle;
    double salary;

    public Employee(String name,int age,String jobTitle,double salary){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }

    public Employee(){}






    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}
