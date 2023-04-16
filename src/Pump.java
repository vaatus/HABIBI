import java.util.ArrayList;

public class Pump extends ActiveElement implements PumpPipe{
    private  Pipe incoming_pipe ;
    // we need to add this :
    private int id;
    private Pipe outgoing_pipe;
    private int max_connectable_pipes;
    private int current_connected_pipes;
    private ArrayList<Pipe> neighbouring_pipes= new ArrayList<>();
    private ArrayList<Pipe> connected_pipes = new ArrayList<>();
    private boolean working;

    @Override
    public void SetPumpDirection(int i1,int i2){
        System.out.println("SetPumpDirection()");
        incoming_pipe.setId(i1);
        outgoing_pipe.setId(i2);
        if(!neighbouring_pipes.contains(i1) || !neighbouring_pipes.contains(i2))
            System.out.println("The pipe(s) are not neighbouring to the pump you are standing on ");
    };
    public void GoOutOfOrder(){
        System.out.println("GoOutOfOrder()");
        working =false ;
    };

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
    public boolean GetWorking (){
        return working;
    }

}
