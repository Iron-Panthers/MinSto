
public class Handles {
   
    public String direction;

    public Handles(String direction)
    {
        this.direction = direction;
    }

    public void getDirection()
    {
        System.out.println("The bike is currently being turned " + direction);
    }

    public void changeDirection(String dir)
    {
        this.direction = dir;
        System.out.println("The bike is now turning " + dir);
    }


}