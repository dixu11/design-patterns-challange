package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private String mail;
    private String address;
    private LocalDate birthDate;
    private int phone;

    private Person() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

   static class PersonBuilder {

       private Person person = new Person();

       public PersonBuilder withFullName(String fullName){
          person.fullName = fullName;
           return this;
       }
       public PersonBuilder withMail(String mail){
           person.mail = mail;
           return this;
       }
       public PersonBuilder withAddress(String address){
           person.address = address;
           return this;
       }

       public PersonBuilder withTel(int number){
           person.phone = number;
           return this;
       }

       public PersonBuilder bornIn(LocalDate birthday){
           person.birthDate = birthday;
           return this;
       }

       public Person build(){
           return person;
       }



   }
}
