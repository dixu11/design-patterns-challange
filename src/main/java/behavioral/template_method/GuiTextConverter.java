package behavioral.template_method;

import javax.swing.*;
import java.util.Scanner;

public class GuiTextConverter  extends TextConverter{
    @Override
    public String load() {
       return JOptionPane.showInputDialog("Wpisz zdanie - postaram się, wyświetlić je od tyłu :)");
    }

    @Override
    public void present(String sentenceBackward) {
        JOptionPane.showMessageDialog(null,"Twoje zdanie: "+ sentenceBackward );
    }
}
