public class Player {
    private int id;
    private String role;
    private PumpPipe position;
    public void ChangePumpDirection(int in_pi,int out_pi){
        System.out.println("ChangePumpDirection()");
        if (position.GetType()=="Pump"){
            Pump pump= (Pump) position;
            pump.SetPumpDirection(in_pi,out_pi);
        }
    }
    public void Move(PumpPipe i){
        System.out.println("Move()");
        position=i;
    };
}
