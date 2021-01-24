package structural.adapterExample;

public class Demo {
    public static void main(String[] args) {
        King king = new King();
        FigureAdapter adapter = new FigureAdapter(new Checker2());


        Game game = new Game();



        game.playChess(king);
        game.playChess(adapter);

    }




}
