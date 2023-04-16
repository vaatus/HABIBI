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
        System.out.println("Move()");
        if(destination.GetType() == "Pump")
        {
            position=destination;
            return;
        }
        Pipe pi = (Pipe) destination;
        if(pi.GetBusy())
        {
            System.out.println("pipe is busy");
            return;
        }
        position = destination;
    }
}
