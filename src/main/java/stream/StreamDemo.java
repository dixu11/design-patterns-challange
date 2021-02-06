package stream;

import advancedJava.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda","Iza"));

        Set<Person> people = new TreeSet<>();
        people.add(new Person("Bartek",33, List.of("mleko","jajka")));
        people.add(new Person("Gosia",20,List.of("bułki","woda")) );
        people.add(new Person("Marcin",44, new ArrayList<>()));
        System.out.println(people);


        people.stream()
                .map(person -> person.getName())
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name));

        names.stream()
                .map(name -> new Person(name))
                .forEach(person -> System.out.println(person));

        //chcę dostać listę z samymi nazwami produktów
        List<String> products = people.stream()  // Stream<Person>
                .flatMap(person -> person.getProducts().stream()) // Stream<List<String>>
                .collect(Collectors.toList());

        System.out.println(products);


        String text = "zdanie";
        String pusty = null;
        Random random = new Random();
        String nieWiadomo;
        if (random.nextDouble() > 0.5) {
            nieWiadomo = text;
        } else {
            nieWiadomo = pusty;
        }

        //tworzenie optionala dla pełnego:
        Optional<String> pelny = Optional.of(text);
        Optional<String> pustyOptional = Optional.empty();
        Optional<String> bycMozeString = Optional.ofNullable(nieWiadomo);

        System.out.println(pelny);
        System.out.println(pustyOptional);
        System.out.println(bycMozeString);
    }


}
