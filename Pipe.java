public class Pipe implements PumpPipe {
    private int id;
    private ActiveElement active_element_end;
    private boolean free_end;
    private boolean working;
    public void Connect(int i){};
    public void Disconnect(int i){};
    public void SetBusy(){};
    public float getLeakage(){return};
    public float getWaterTransferred(){return};

    @Override
    public String GetType() {
        return null;
    }

    @Override
    public void ChangeState() {

    }
}
