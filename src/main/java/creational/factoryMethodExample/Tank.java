package creational.factoryMethodExample;

public abstract class Tank {

    private Barrel barrel;

    public Tank() {
        barrel = buildBarrel();
    }

    public abstract Barrel buildBarrel();


    public void shoot() {
        barrel.shoot();
    }
}
