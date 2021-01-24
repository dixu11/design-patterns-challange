package structural.decorator;

public class ChristmasBaubles  extends ChristmasTreeDecorator{
    public ChristmasBaubles(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String getDecoratedTree() {
        return decoratedTree.getDecoratedTree() + " z bombkami";
    }
}
