package structural.adapterExample;

public class FigureAdapter implements Figure{

    private IChecker checker;

    public FigureAdapter(IChecker checker) {
        this.checker = checker;
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return checker.tryToMove(x,y);
    }
}
