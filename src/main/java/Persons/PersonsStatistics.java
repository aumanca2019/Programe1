package Persons;

public class PersonsStatistics {


    Person[] allPersons;

    public PersonsStatistics(Person[] persons) {
        this.allPersons = persons;
    }

    public Person oldestWoman() {
        Person oldestPerson = new Person();

        for (int i = 0; i < allPersons.length; i++) {
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "woman") {
                if ((currentPerson.getAge() > oldestPerson.getAge())) {
                    oldestPerson = currentPerson;


                }
            }
        }

        return oldestPerson;

    }

    public Person oldestMan() {
        Person oldestPerson = new Person();

        for (int i = 0; i < allPersons.length; i++) {
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "man") {
                if ((currentPerson.getAge() > oldestPerson.getAge())) {
                    oldestPerson = currentPerson;


                }
            }
        }

        return oldestPerson;


    }

    public int womanCount(){
        int w = 0;
        for (int i = 0;i < allPersons.length;i++){
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "woman"){
                w = w + 1;
            }
        }
        return w;
    }

    public int manCount(){
        int m = 0;
        for (int i = 0;i < allPersons.length;i++){
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "man"){
                m = m + 1;
            }
        }
        return m;
    }

    public int averagewomanAge(){
        int sum = 0;
        for (int i = 0;i < allPersons.length;i++){
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "woman"){
                sum = sum + currentPerson.getAge();
            }
        }
        return sum/womanCount();
    }

    public int averagemanAge(){
        int sum = 0;
        for (int i = 0;i < allPersons.length;i++){
            Person currentPerson = allPersons[i];
            if (currentPerson.getSex() == "man"){
                sum = sum + currentPerson.getAge();
            }
        }
        return sum/manCount();
    }
}
