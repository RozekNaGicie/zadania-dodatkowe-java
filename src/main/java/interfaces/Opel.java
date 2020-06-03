package interfaces;

public class Opel implements Car {


    @Override
    public int getSpeed() {
        return 5;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("speed increasing by 10");
    }

    @Override
    public void decreseSpeed() {
        System.out.println("speed deacresing by 5");
    }
}
