package creational.singleton;

public class CommandStation {

//    private static CommandStation instance = new CommandStation(); // Eager
    private static CommandStation instance = null; // Lazy

    private CommandStation(){ // uniemozliwiam wolny dostep do konstruktora
        System.out.println("tworzenie instancji");
    }

    public static CommandStation getInstance(){ // metoda udostępniająca jedyną instancje obiektu
           if (instance == null) { //lazy
               instance = new CommandStation();
           }
        return instance;
    }

    public static void metoda() {
        System.out.println("hello");
    }

}
