package behavioral.mediator;

public class Button {

    private behavioral.mediator.fan_simulation.Mediator mediator;

    public Button(behavioral.mediator.fan_simulation.Mediator mediator) {
        this.mediator = mediator;
    }

    public void push() {
        if (mediator.isFanOn()) {
            mediator.turnOffFan();
        } else {
            mediator.turnOnFan();
        }
    }


}
