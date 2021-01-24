package structural.adapterExample;

public class Checker2 implements  IChecker{

    public boolean tryToMove(int x, int y) {
        System.out.println("<ruch pionka2>");
        return false;
    }
}
