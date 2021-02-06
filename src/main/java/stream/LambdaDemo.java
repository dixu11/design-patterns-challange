package stream;

import java.util.Scanner;
import java.util.function.*;

public class LambdaDemo {
    public static void main(String[] args) {
        Equation equation = new Equation() {
            @Override
            public int compute(int number1, int number2) {
                return number1 + number2;
            }
        };

        System.out.println(equation.compute(2, 2));


        //

        Equation equation2 = (number1, number2) -> number1 + number2;

        BinaryOperator<Integer> addition = (a,b) -> a+b;

        calculator(2,equation2 , 2);

        calculator(2,(a,b) -> a-b,2);
        calculator(2,(a,b) -> a*b,2);
        calculator(2,(a,b) -> a/b,2);

        //Operator ->    (int) -> int
        //BinaryOperator -> (int,int) -> int
        //Function ->    String -> int
        //Comparator    (Person,Person) -> int
        //Supplier      () -> int
        //Consumer      int -> void
        //Predicate     Person -> boolean

        Predicate<String> isGetter = (methodName) -> methodName.startsWith("get");

        String getter = "getAge";
        String setter = "setAge";

        System.out.println(isGetter.test(getter));
        System.out.println(isGetter.test(setter));

        Function<String,Integer> intScanner = question -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println(question);
            return scanner.nextInt();
        };

        Integer number = intScanner.apply("Podaj liczbę od 1 do 10");
        System.out.println("Podano " + number);


    }

    public static void calculator(int number, Equation equation, int number2) {
        System.out.println("Obliczam...");
        System.out.println("Wynik to:");
        System.out.println(equation.compute(number,number2));
    }
}
