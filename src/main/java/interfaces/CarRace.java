package interfaces;

public class CarRace {

    public static void doRace(Car car) {
        car.decreseSpeed();
        car.increaseSpeed();
    }
    public static void main(String[] args) {
        Car opel = new Opel();
        CarRace.doRace(opel);
    }

}
