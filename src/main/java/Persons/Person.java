package Persons;

public class Person {
    private int age;
    private String name;
    private String sex;

    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(){}


    public void afisarePersoana(){
        System.out.println("Persoana" + name + "are varsta" +  age + " si este " + sex);
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
