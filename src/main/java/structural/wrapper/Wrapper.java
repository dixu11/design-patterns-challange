package structural.wrapper;

public class Wrapper extends SomeObject {

    private SomeObject inside;

    public Wrapper( SomeObject inside) {
        this.inside = inside;
    }


    @Override
    public void doStuff() {
        inside.doStuff();
    }
}
