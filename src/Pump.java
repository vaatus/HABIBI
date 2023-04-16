import java.util.ArrayList;

public class Pump extends ActiveElement implements PumpPipe{
    private int id;
    private  Pipe incoming_pipe ;
    private Pipe outgoing_pipe;
    private int max_connectable_pipes;
    private int current_connected_pipes;
    private ArrayList<Pipe> neighbouring_pipes = new ArrayList<>();
    private ArrayList<Pipe> connected_pipes = new ArrayList<>();
    private boolean working;

    public Pump(Pipe pipe, Pipe pipe1) {
        super();
    }


    public void SetPumpDirection(Pipe p_in,Pipe p_out){
        System.out.println("SetPumpDirection()");
        incoming_pipe = p_in;
        outgoing_pipe = p_out;
    }
    public void GoOutOfOrder(){
        System.out.println("GoOutOfOrder()");
        working =false ;
    }

    @Override
    public String GetType() {
        System.out.println("GetType()");
        return "Pump";
    }


    @Override
    public void ChangeState() {
        working =!working ;
    }
    public void add(Pipe p){
        connected_pipes.add(p);
    }
    public void remove(Pipe p){
        connected_pipes.remove(p);
    }
    @Override
    public boolean GetWorking (){
        return working;
    }

    @Override
    public int GetID() {
        return id;
    }

    @Override
    public int TransferWater() {
        int water_level = getCurrentWaterLevel();
        if (!water_tank.isFull()){
            water_tank.AddWater(1);
            return 0;
        }

        if(!working)
        {
            System.out.println("pump is broken");
            return 0;
        }

        if(!outgoing_pipe.GetWorking())
        {
            System.out.println("Pipe is leaking");
            return 1;
        }

        if(outgoing_pipe.GetOutgoing() == null){
            System.out.println("the pipe is not connected");
            return 1;
        }

        return outgoing_pipe.GetOutgoing().TransferWater();
    }
}
