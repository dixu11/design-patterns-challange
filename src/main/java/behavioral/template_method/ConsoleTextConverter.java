package behavioral.template_method;

import java.util.Scanner;

public class ConsoleTextConverter extends TextConverter {
    @Override
    public String load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie - postaram się, wyświetlić je od tyłu :)");
       String sentence = scanner.nextLine();
       return sentence;
    }

    @Override
    public void present(String sentenceBackward) {
        System.out.println("Twoje zdanie: ");
        System.out.println(sentenceBackward);
    }
}
