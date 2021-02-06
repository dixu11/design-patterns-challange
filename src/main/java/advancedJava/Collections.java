package advancedJava;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {

        Set<Person> people = new TreeSet<>();
        people.add(new Person("Bartek",33));
        people.add(new Person("Gosia",20));
        people.add(new Person("Marcin",44));
        System.out.println(people);


        Set<Person> peopleSortedByAge = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        peopleSortedByAge.add(new Person("Bartek",33));
        peopleSortedByAge.add(new Person("Gosia",20));
        peopleSortedByAge.add(new Person("Marcin",44));

        System.out.println(peopleSortedByAge);





    }
}
