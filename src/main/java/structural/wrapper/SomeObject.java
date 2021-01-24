package structural.wrapper;

public class SomeObject {

    private int id;
    private String name;

    public SomeObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public SomeObject() {
    }

    public void doStuff() {
        System.out.println("Jestem " + name);
        System.out.println("Doin");
    }
}
