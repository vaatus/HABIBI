public class Pump extends ActiveElement implements PumpPipe{
    private  Pipe incoming_pipe ;
    private Pipe outgoing_pipe;
    private int max_connectable_pipes;
    private int current_connected_pipes;
    private boolean working;

    public void SetPumpDirection(int i1,int i2){};
    public void GoOutOfOrder(){};

    @Override
    public String GetType() {
        return null;
    }

    @Override
    public void ChangeState() {

    }

}
