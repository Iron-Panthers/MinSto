public class Bicycle {

    // class variables
    public String color, size, wheelSize, direction;
    public int wheelWidth, seatHeight, stopSpeed;
    public boolean canBrake;
    public Seat seat = new Seat(seatHeight);
    public Wheels wheels = new Wheels(wheelSize, wheelWidth);
    public Brake brake = new Brake(canBrake, stopSpeed);
    public Handles handles = new Handles(direction);


    // Bike init function, the syntax in order should be (color, size, wheel size, wheel width, seat hight, )
    public Bicycle(String color, String size, Wheels wheels, Seat seat, Brake brake, Handles handles)
    {
        this.color = color;
        this.size = size;
        this.seat = seat;
        this.brake = brake;
        
    }
    // add functions (may be removed and added to individual components)
    public void getColor()
    {
        System.out.println("The color of the bike is " + this.color);
    }
}