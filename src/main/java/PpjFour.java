public class PpjFour {

    int someInt;
    char someChar;
    float someFloat;
    double someDouble;
    byte someByte;

    public PpjFour(int someInt, char someChar, float someFloat, double someDouble, byte someByte) {

        this.someInt = someInt;
        this.someChar = someChar;
        this.someFloat = someFloat;
        this.someDouble = someDouble;
        this.someByte = someByte;

    }

    public void task6() {

//        Jaki będzie rezultat dodania:
////        • do zmiennej typu char zmiennej typu int,
////        • do zmiennej typu int zmiennej typu char,
////        • do zmiennej typu float zmiennej typu double,
////        • do zmiennej typu byte zmiennej typu int

        this.someChar += this.someInt;
        System.out.println("zmienna char + int " + this.someChar);

        this.someInt += this.someChar;
        System.out.println("zmienna int + char " + this.someInt);

        this.someFloat += this.someDouble;
        System.out.println("zmienna float + double " + this.someChar);

        this.someByte += this.someInt;
        System.out.println("zmienna byte + int " + this.someByte);

    }

    public void task8() {

//        Poniższy fragment kodu pozwoli na wprowadzenie do programu liczby wprowadzonej z klawiatury, a następnie przechowa pozyskaną wartość w
//        zmiennej studentId: 1 java.util.Scanner in = new java.util.Scanner(System.in) ; 2 int studentId = in.nextInt();

        java.util.Scanner in = new java.util.Scanner(System.in);
        int studentId = in.nextInt();
        System.out.println("Hello s" + studentId);

    }

    public void task9() {

//        Zmiana wprowadzonej liczby na znak char

        java.util.Scanner in = new java.util.Scanner(System.in);
        int studentId = in.nextInt();
        char mark = (char) studentId;
        System.out.println(mark);

    }
}
