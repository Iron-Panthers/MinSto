public class Seat {

    public int seatHeight;

    public Seat (int seatHeight){
        this.seatHeight = seatHeight;
    } 

    public void changeSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
        System.out.println("The new seat height is now " + seatHeight);
    }

    
}