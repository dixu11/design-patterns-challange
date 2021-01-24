package structural.decorator;

public abstract class ChristmasTreeDecorator implements ChristmasTree {

    protected ChristmasTree decoratedTree;

    public ChristmasTreeDecorator(ChristmasTree decoratedTree) {
        this.decoratedTree = decoratedTree;
    }

}
