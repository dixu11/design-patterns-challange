package creational.factoryMethodExample;

public class Demo {
    public static void main(String[] args) {
        Tank player1 = new TankRight();
        Tank player2 = new TankLeft();

        player1.shoot();
        player2.shoot();
    }
}
