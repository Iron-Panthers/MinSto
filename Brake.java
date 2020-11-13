class Brake {
    public boolean doesWork;
    public int stopSpeed;

    public Brake(boolean doesWork, int stopSpeed) {
        this.stopSpeed = stopSpeed;
        this.doesWork = doesWork;
    }

    public boolean canBrake() {
        if (doesWork == true) {
            System.out.println("The brake seems to be working!");
            return true;
        }
        else {
            System.out.println("There seems to be something wrong with the brake.");
            return false;
        }
    }

    public void fixBrake()
    {
        if (doesWork == true) {
            System.out.println("The brake seems to be working, no need for a repair.");
            
        }
        else {
            System.out.println("The brake is now fixed!");
            this.doesWork = true;
            
        }
    }
}