public class BikeMain {
    public static void main(String[] args) {


    // init function, the syntax in order should be (color, size, wheel, seat )
        Bicycle myBike = new Bicycle("red", "large", new Wheels("large", 5), new Seat(100)); 

        myBike.seat.changeSeatHeight(90);
        myBike.wheels.repair();
    }
  }