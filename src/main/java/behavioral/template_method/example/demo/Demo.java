package behavioral.template_method.example.demo;

import behavioral.template_method.example.Board;
import behavioral.template_method.example.ForestBoard;
import behavioral.template_method.example.MountainBoard;

public class Demo {
    public static void main(String[] args) {
        Board board = new ForestBoard();
        Board board2 = new MountainBoard();

        board.display();
        board2.display();
    }
}
