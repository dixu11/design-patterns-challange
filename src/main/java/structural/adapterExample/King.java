package structural.adapterExample;

public class King implements Figure {
    @Override
    public boolean canMoveTo(int x, int y) {
        System.out.println("<ruch króla>");
        return true;
    }
}
