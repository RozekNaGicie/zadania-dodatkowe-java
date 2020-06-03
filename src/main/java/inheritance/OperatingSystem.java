package inheritance;

public class OperatingSystem {

    int yearOfProduce;
    public OperatingSystem(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }
    void turnOn(){
        System.out.println("Turning On");
    }
    void turnOff(){
        System.out.println("Turning Off");
    }
}
