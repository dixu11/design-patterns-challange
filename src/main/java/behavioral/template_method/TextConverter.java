package behavioral.template_method;

import java.util.Scanner;

public abstract class TextConverter {


    public final void runConverter() {
        //TODO przerób te metodę na metodę szablonową -> przygotuj 2 klasy implementujące ten szablon
        String sentence = load();
        String sentenceBackward = compute(sentence);
        present(sentenceBackward);
    }

    protected abstract String load();

    private String compute(String sentence) {
        String[] words = sentence.split(" ");
        String sentenceBackward = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward += word + " ";
        }
        return sentenceBackward;
    }

    protected abstract void present(String sentenceBackward);

}
