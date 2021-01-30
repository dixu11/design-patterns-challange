package exceptions;

public class RuntimeExceptions {

    public static void main(String[] args) {
        int[] numbers = {345, 56, 67, 3};
        String text = null;


        try {
            numbers[7] = 10;
            System.out.println(text.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Wystąpił wyjątek: " + e.getClass());
            System.out.println("Wiadomość: " + e.getMessage());
        } finally {
            System.out.println("close all failes");
        }

        System.out.println("Ustawiono liczbę");
    }


}
