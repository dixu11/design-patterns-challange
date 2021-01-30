package behavioral.mediator;

public class Fan {

    private boolean on;
    behavioral.mediator.fan_simulation.Mediator mediator;

    public Fan(behavioral.mediator.fan_simulation.Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOn() {
        mediator.startSupplier();
        on = true;
    }

    public void turnOff() {
        mediator.stopSupplier();
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
