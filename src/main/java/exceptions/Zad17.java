package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        /*
        * Wywołaj wyjątek NullPointerException i obsłuż go w main
        *
Stwórz Scanner, poproś o podanie liczby. W sytuacji gdy wystąpi wyjątek wyświetl
* “Podano litery , nie można przekonwertować do typu int”
*
Bezpośrednio w ścieżce projektu stwórz plik “ksiazki.txt” w pliku tym wypisz
* conajmniej 3 tytuły książek dot. programowania które czytasz lub zamierzasz przeczytać.
*
*  Napisz program który wyświetla wszystkie tytuły w tym pliku wykorzystując
* Scanner a w razie braku pliku wyświetla komunikat, że masz się zabrać za czytanie :)

        * */

     /*   Random random = null;
        try {
            random.nextInt();
        }catch (NullPointerException e){
            System.out.println("Null!");
        }*/

//        int aValue = readNumber();
//        System.out.println("Passed value was: " + aValue);

        readTitles();
    }

    public static int readNumber() {
        System.out.println("Say any number:");
        Scanner scanner = new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Only numbers allowed, try again");
           return readNumber();
        }
    }

    public static void readTitles() {
        try {
            Scanner scanner = new Scanner(new File("src/main/java/exceptions/ksiazki.txt"));
            System.out.println("Czytasz:");
            while (scanner.hasNextLine()) {
                String title = scanner.nextLine();
                System.out.println(title);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Czytaj pan!");
        }
    }
}
