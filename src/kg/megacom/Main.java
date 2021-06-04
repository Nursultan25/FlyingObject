package kg.megacom;

public class Main {

    public static void main(String[] args) {
        Mi8 mi8 = new Mi8();
        Boing737 boing737 = new Boing737();

        Test test = new Test();
        test.foo((FlyingObject) mi8);
        test.foo((VertivalTakeOff) mi8);
    }
}
