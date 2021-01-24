package structural.decorator;

public class TreeWithLights extends ChristmasTreeDecorator{

    private String color = "green";

    public TreeWithLights(ChristmasTree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String getDecoratedTree() {
        return decoratedTree.getDecoratedTree() + " ze światełkami";
    }

    public String getLightsColor() {
        return color;
    }
}
