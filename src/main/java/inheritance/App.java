package inheritance;

public class App {
    public static void main(String[] args) {
        Windows windows = new Windows(1990);
        windows.turnOff();
        System.out.println(windows.yearOfProduce);
    }
}
