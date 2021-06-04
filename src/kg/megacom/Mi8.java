package kg.megacom;

public class Mi8 extends Helicopter implements VertivalTakeOff {
    @Override
    public void fly() {
        System.out.println("Helicopter mi8");
    }

    @Override
    public void verticalTakeOff() {
        System.out.println("Helicopter mi 8 vertical");
    }
}
