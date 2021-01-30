package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zad17b {

    public static void main(String[] args) {
        FileConnection connection = new FileConnection();
        try {
            connection.connect();
            List<String> lines = connection.readTitles();
            lines.forEach(line -> System.out.println(line));
        } catch (FileConnectionException e) {
            System.out.println(e.getMessage());
        }finally {
            connection.disconnect();
        }


    }
}

class FileConnection {

    private boolean connected = false;

    public void connect() throws FileConnectionException {
        Random random = new Random();
        if (random.nextDouble() <= 0.25) {
            throw new FileConnectionException("Nie uzyskano połączenia");
        }


        connected = true;
    }

    public List<String> readTitles() throws FileConnectionException {
        if (!connected) {
            throw new FileConnectionException("Najpierw należy się połączyć");
        }
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("src/main/java/exceptions/ksiazki.txt"));
            System.out.println("Czytasz:");
            while (scanner.hasNextLine()) {
                String title = scanner.nextLine();
                lines.add(title);
            }
        } catch (FileNotFoundException exception) {
            throw new FileConnectionException("Brak pliku");
        }
        if (lines.isEmpty()) {
            throw new FileConnectionException("Pusty plik");
        }
        return lines;
    }

    public void disconnect() {
        connected = false;
    }

}

class FileConnectionException extends Exception {


    public FileConnectionException(String message) {
        super(message);
    }
}

