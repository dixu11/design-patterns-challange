package structural.wrapper;

public class Demo {
    public static void main(String[] args) {
        SomeObject object = new Wrapper(new SomeObject());
        object.doStuff();


    }
}
