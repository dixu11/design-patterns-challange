package behavioral.template_method.example;

public abstract class Board {

    public final void display() { // metoda szablonowa
        showStart();
        showPath();
        showEnd();
    }

    private void showStart() {
        System.out.println("Wyswietlam graczy na starcie");
    }

    protected abstract void showPath();

    protected abstract void showEnd();
}
