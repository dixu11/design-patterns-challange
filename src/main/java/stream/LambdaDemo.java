package stream;

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
        calculator(2, (number1, number2) -> number1 + number2, 2);

        calculator(2,(a,b) -> a-b,2);
        calculator(2,(a,b) -> a*b,2);
        calculator(2,(a,b) -> a/b,2);
    }

    public static void calculator(int number, Equation equation, int number2) {
        System.out.println("Obliczam...");
        System.out.println("Wynik to:");
        System.out.println(equation.compute(number,number2));
    }
}
