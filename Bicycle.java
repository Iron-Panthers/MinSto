public class Bicycle {

    // class variables
    public String color, size, wheelSize;
    public int wheelWidth, seatHeight;
    public Seat seat = new Seat(seatHeight);


    // Bike init function, the syntax in order should be (color, size, wheel size, wheel width, seat hight, )
    public Bicycle(String color, String size, String wheelSize, int wheelWidth, int seatHight, Seat seat)
    {
        this.color = color;
        this.size = size;
        this.seat = seat;
        
        


    }
    // add functions (may be removed and added to individual components)

}