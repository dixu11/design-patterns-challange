package behavioral.template_method.example;

public class MountainBoard extends Board {
    @Override
    public void showPath() {
        System.out.println("Sciezka biegnie po gorach");
    }

    @Override
    public void showEnd() {
        System.out.println("Meta na szczycie góry");
    }
}
