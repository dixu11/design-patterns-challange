package reflection.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import reflection.Person;

public class Demo {
    public static void main(String[] args) throws JsonProcessingException {
//        Person person = new Person(1, "Damian Nowak");
        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(person);  // wymagane getry!
//        System.out.println(json);

        String personJson = "{\"id\":1,\"fullName\":\"Damian Nowak\"}";
        Person person = mapper.readValue(personJson, Person.class); // wymagany konstr. bezparametrowy!
        System.out.println(person);
    }
}
