package structural.adapterExample;

public class Checker implements IChecker {

    public boolean tryToMove(int x, int y) {
        System.out.println("<ruch pionka>");
        return false;
    }
}
