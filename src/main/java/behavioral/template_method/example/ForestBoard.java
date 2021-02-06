package behavioral.template_method.example;

public class ForestBoard extends Board {
    @Override
    public void showPath() {
        System.out.println("Sciezka biegnie przez las");
    }

    @Override
    public void showEnd() {
        System.out.println("Meta na końcu lasu");
    }
}
