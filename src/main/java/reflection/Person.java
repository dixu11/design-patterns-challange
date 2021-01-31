package reflection;

public final class Person {
    private int id;
    private String fullName;

    private Person(){

    }

    public Person(int id, String name) {
        this.id = id;
        this.fullName = name;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void sayHello(String name) {
        System.out.println("Hi, " + name + " i am " + fullName);
    }

    public void sayHello(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + fullName + '\'' +
                '}';
    }
}
