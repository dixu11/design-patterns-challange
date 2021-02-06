package advancedJava;

import java.util.List;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private List<String> products;

    public Person(String name, int age, List<String> products) {
        this.name = name;
        this.age = age;
        this.products = products;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getProducts() {
        return products;
    }
}
