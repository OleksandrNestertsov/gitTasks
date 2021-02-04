package main.java.com.alevel.alevelHomeWorks.hw05StudentsCostsContracts;

public class Student {
    private String name;
    private String surname;
    private int age;


    Student(String n, String sn, int a) {

        this.name = n;
        this.surname = sn;
        this.age = a;
    }

    void showAllInfo() {
        System.out.print("name : " + name + ";" + '\t');
        System.out.print("surname : " + surname + ";" + '\t');
        System.out.print("age : " + age + ";" + '\t');
    }

    void showInfo() {

    }
}
