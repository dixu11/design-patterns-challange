package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");

      /*  Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/
        //wykonaj polecenie z ar

        Person person = Person.builder()
                .withFullName("Anna Markowska")
                .withMail("a.markowska22@gmail.com")
                .withAddress("Wojska Polskiego 2")
                .withTel(345345546)
                .bornIn(LocalDate.now().minusYears(18))
                .build();



        System.out.println(person);

        String tekst = "abc";



    }
}
