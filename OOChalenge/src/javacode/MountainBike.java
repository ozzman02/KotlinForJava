package javacode;

public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The mountain bike has a seat height of " + seatHeight + " inches.");
    }

}
