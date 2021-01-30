package behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        behavioral.mediator.fan_simulation.Mediator mediator = new behavioral.mediator.fan_simulation.Mediator();
        behavioral.mediator.fan_simulation.PowerSupplier supplier = new behavioral.mediator.fan_simulation.PowerSupplier();
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);

        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be on. Is it on? " + supplier.isOn());
        button.push();
        System.out.println("Power supplier should be off. Is it on? " + supplier.isOn());
    }
}
