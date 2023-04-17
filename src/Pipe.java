package src;

public class Pipe implements PumpPipe {
    private int id;
    private static int number=0;
    private ActiveElement active_element_end;
    private ActiveElement active_element_begin;
    private boolean working;
    private boolean busy;

    //Pipe class constructor
    public Pipe() {
        active_element_begin = null;
        active_element_end = null;
        working = true;
        busy = false;
        id=number++;
    }

    public void Connect(Pump p1, Pump p2) {
        System.out.println("Connect()");
        if (!(p1.CanAdd() || (active_element_end!=null && active_element_begin!=null))) {
            System.out.println("You can’t connect more pipes to the pump");
            return;
        }
        p1.add(this);
        if (!(p2.CanAdd() || (active_element_end!=null && active_element_begin!=null))) {
            System.out.println("You can’t connect more pipes to the pump");
            return;
        }
        p2.add(this);
    }

    public void Disconnect(Pump p1, Pump p2) {
        System.out.println("Disonnect()");
        if (!(p1.CheckConnection(this) || (active_element_end==null && active_element_begin==null))){
            System.out.println("The pipe is already disconnected from the pump.");
            return;
        }
        p1.remove(this);
        if (!(p2.CheckConnection(this) || (active_element_end==null && active_element_begin==null))){
            System.out.println("The pipe is already disconnected from the pump.");
            return;
        }
        p2.remove(this);
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

    public Pump GetActiveElementEnd() {
        return (Pump) active_element_end;
    }

    public Pump GetActiveElementBegin() {
        return (Pump) active_element_begin;
    }

    public void SetIncoming(ActiveElement incoming) {
        active_element_begin=incoming;
    }

    public void SetOutgoing(ActiveElement outgoing) {
        active_element_end=outgoing;
    }
}