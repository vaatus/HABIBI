public class Player {
    protected int id;
    protected String role;
    protected PumpPipe position;
    public void ChangePumpDirection(Pipe p_in,Pipe p_out){
        System.out.println("ChangePumpDirection()");
        if (position.GetType()=="Pump"){
            Pump pump= (Pump) position;
            pump.SetPumpDirection(p_in,p_out);
        }
    }
    public void Move(PumpPipe i){
        System.out.println("Move()");
        position=i;
    };
}
