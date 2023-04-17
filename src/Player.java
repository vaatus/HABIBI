package src;

public class Player {
    protected int id;
    protected String role;
    protected PumpPipe position;
    public void ChangePumpDirection(Pipe p_in,Pipe p_out){
        System.out.println("ChangePumpDirection()");
        if (position.GetType()=="Pipe") {
            System.out.println("Please stand up on a pump");
            return;
        }
        Pump pump = (Pump) position;
        pump.SetPumpDirection(p_in,p_out);
        System.out.println("The direction is changed");
    }
    public void Move(PumpPipe destination){

        if(destination.GetType() == "Pump")
        {
            if (position!=null){
                position.SetFree();
            }
            position=destination;
            System.out.println("Move(): Player has been moved to the Pump "+destination.GetID());
            return;
        }
        Pipe pi = (Pipe) destination;
        if(pi.GetBusy())
        {
            System.out.println("pipe is busy");
            return;
        }
        if (position!=null){
            position.SetFree();
        }
        position = destination;
        pi.SetBusy();
        System.out.println("Move(): Player has been moved to the Pipe "+destination.GetID());
    }
}
