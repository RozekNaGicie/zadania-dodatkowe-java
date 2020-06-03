package abstracts;

public class Square extends Shape {

    @Override
    public void pole(int a, int b) {
        System.out.println(a*a);
    }

    @Override
    public void obw(int a, int b) {
        System.out.println(Math.multiplyExact(a,b));
    }
}
