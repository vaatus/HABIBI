public class Pipe implements PumpPipe {
    private int id;
    private ActiveElement active_element_end;
    private ActiveElement active_element_begin;
    private boolean free_end;
    private boolean working;
    private boolean busy;

    public void Connect(Pump p) {
        System.out.println("Connect()");
        p.add(this);

    }

    public void Disconnect(Pump p) {
        System.out.println("Disonnect()");
        p.remove(this);
    }

    public void SetBusy()
    {
        System.out.println("SetBusy()");
        busy = true;
    }
    public boolean GetBusy(){
        return busy;
    }


    public float getLeakage(){
        System.out.println("getLeakage()");
        // TODO: Implement the logic for calculating the leakage of the pipe
        return 0;
    }

    public float getWaterTransferred(){
        System.out.println("getWaterTransferred()");
        // TODO: Implement the logic for calculating the amount of water transferred through the pipe
        return 0;
    };

    @Override
    public String GetType() {
        System.out.println("GetType()");
        return "Pipe";
    }

    @Override
    public void ChangeState() {
        System.out.println("ChangeState()");
        working = !working;
    }

    @Override
    public boolean GetWorking() {
        return working;
    }
}