package javacode;

public class RoadBike extends Bicycle {

    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a tire width of " + tireWidth + " MM.");
    }

}
