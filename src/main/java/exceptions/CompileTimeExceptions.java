package exceptions;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeExceptions {

    //checked / comile time -> dziedziczące po Exception
    public static void main(String[] args) {

       /* try {
            Scanner scanner = new Scanner(new File("poematy.txt"));
            String line = scanner.nextLine();
            System.out.println("treść z  pliku: " + line);
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku");
        }*/

        try {
            method1();
        } catch (FileNotFoundException exception) {
            JOptionPane.showMessageDialog(null,"Brak pliku");
        }
    }

    public static void method1() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method3();
    }

  /*  public static void method3() {
        try {
            Scanner scanner = new Scanner(new File("poematyy.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        }
    }*/

    public static void method3() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("poematyy.txt"));
    }


}
