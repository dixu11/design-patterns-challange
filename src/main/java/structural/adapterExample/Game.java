package structural.adapterExample;

public class Game {

    public  void playChess(Figure figure) {
        System.out.println("Ruch figury:");
        figure.canMoveTo(1, 1);
    }
}
