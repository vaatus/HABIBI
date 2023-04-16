public class Pipe implements PumpPipe {
    private int id;
    private ActiveElement active_element_end;
    private ActiveElement active_element_begin;
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

    @Override
    public int GetID() {
        return id;
    }

    public ActiveElement GetOutgoing() {
        return active_element_end;
    }
}