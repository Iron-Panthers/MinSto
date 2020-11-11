public class Wheels
{
    String size;
    int thickness;
    boolean broken;
    public Wheels(String size, int thickness)
    {
        this.size = size;
        this.thickness = thickness;
        this.broken = false;
    }

    public void drive()
    {
        if (this.broken == false){
            System.out.println("VROOOOOOOOOM! Oh no, the wheel popped off!");
            this.broken = true;
        }else
        {
            System.out.println("Wheel needs to be repaired before driving");
        }
       
    }

    public void repair()
    {
        if (this.broken)
        {
            this.broken = false;
            System.out.println("The wheel has been repaired!");
        } else 
        {
            System.out.println("The wheel is fine, no need to repair it.");
        }
    }

}