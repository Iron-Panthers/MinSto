public class BikeMain {
    public static void main(String[] args) {


    // init function, the syntax in order should be (color, size, wheel, seat, brake, handles)
        Bicycle myBike = new Bicycle("red", "large", new Wheels("large", 5), new Seat(100), new Brake(false, 10), new Handles("right")); 

        myBike.seat.changeSeatHeight(90);
        myBike.wheels.drive();
        myBike.wheels.repair();
        myBike.brake.fixBrake();
        myBike.handles.changeDirection("left");
        myBike.handles.getDirection();
    }
  }