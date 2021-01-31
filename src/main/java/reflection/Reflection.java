package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException, ClassNotFoundException {
        Person person = new Person(2, "J Nowak");
        Class class1 = Person.class;
        Class class2 = person.getClass();
        Class class3 = Class.forName("reflection.Person");

        System.out.println(class3.getName());



       /* Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Method[] methods = class1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType() + " " +method.getName() + " " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println(class1.getName());
        System.out.println(Modifier.toString(class1.getModifiers()) );*/

        person.sayHello("Radek");

        Method method = class1.getMethod("sayHello", String.class);
        method.invoke(person, "Wojtek");

        Constructor<Person> constructor = class1.getConstructor(int.class, String.class);
        Constructor<Person> constructor2 = class1.getDeclaredConstructor();
        Person person2 = constructor.newInstance(20, "Zenon Wojtkowicz");
        System.out.println(person2);
        constructor2.setAccessible(true);
        Person person3 = constructor2.newInstance();
        System.out.println(person3);

        Field field = class1.getDeclaredField("fullName");
        field.setAccessible(true);
        field.set(person, "<HACKED>");

        System.out.println(person);

    }
}
