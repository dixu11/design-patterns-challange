package stream.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    //za zadanię można otrzymać 14 punktów po 1 za każdą zaimplementowaną abstrakcyjną metodę

    public static void main(String[] args) throws FileNotFoundException {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19,19, 19, 23, 29};

        StreamService streamService = new MyStreamService();

        streamService.sortAndPrint(names);
        System.out.println(streamService.distinctAndCountNumbers(primeNumbers));
        List<String> males = streamService.computeMaleNames(names);
        System.out.println(males);
        streamService.printNumbersOfRange(primeNumbers,50,60);

        String shortName = names.stream()
                .sorted((name, name2) -> name.length() - name2.length())
                .filter(name -> name.length() == 3)
                .findFirst() // optional do obsluzenia!
                .orElse(""); // daj pusty tekst jak nie znajdziesz

        System.out.println(shortName);








        //miejsce na Twoje testy zaimplementowanych metod. Jeśli umiesz możesz wykonać testy jednostkowe udowadniające
        //poprawne działanie zaimplementowanych metod

        //List<Person> people = streamService.buildPeopleWithNames(names);
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>

    }

}
