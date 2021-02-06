package behavioral.template_method;

import java.util.Scanner;

public abstract class TextConverter {



    public void runConverter() {
        //TODO przerób te metodę na metodę szablonową -> przygotuj 2 klasy implementujące ten szablon
       String sentence = load();
       String sentenceBackward = compute(sentence);
        present(sentenceBackward);
    }

    public abstract String load();

    public String compute(String sentence) {
        String[] words = sentence.split(" ");
       String sentenceBackward = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward += word + " ";
        }
        return sentenceBackward;
    }

    public abstract void present(String sentenceBackward);

}
