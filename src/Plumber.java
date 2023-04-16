public class Plumber extends Player {
    private boolean has_pump;
    public void FixPump(){};
    public void FixPipe(){};
    public void ConnectPipe(int i){};
    public void InsertPump(){};
    public void PickupPump(Cistern c){};
    public void DisconnectPipe(int i){};
    constructor() {
        super();
        // Additional properties specific to Plumber
    }

    public void FixPump() {
        System.out.println("FixPump()");
        if(position.GetType() == "Pipe"){
            System.out.println("This is not a pump")
            return ;
        }
        //Change pump working property to true
        Pump pu = (Pump)position;
        if(pu.GetWorking){
            return;
        }
        pu.ChangeState();
    }

    public void FixPipe() {
        System.out.println("FixPipe()");
        if(position.GetType() == "Pump"){
            System.out.println("This is not a pipe")
            return ;
        }
        //Change pipe working property to true
        Pipe pi = (Pipe)position;
        if(pu.GetWorking){
            return;
        }
        pi.ChangeState();
    }

    public void ConnectPipe(Pump pu) {
        System.out.println("ConnectPipe()");
        if(position.GetType() == "Pipe"){
            System.out.println("You need to stand on a pump");
            return ;
        }
        Pipe pi = (Pipe)position;
        pu.Connect(pi);
    }

    public void InsertPump() {
        System.out.println("InsertPump()");
        if(position.GetType() == "Pump"){
            System.out.println("Youre already standing on a Pump");
            return ;
        }
        //Constructor needs to be created for Pump class
        positon = new Pump(p1, p2);
    }

    public void PickupPump(Cistern c) {
        System.out.println("PickupPump()");
        c.RemovePump();
        // Further implementation of the PickupPump function
        this.has_pump = true;
    }

    public void DisconnectPipe(Pump pu) {
        pi.Disconnect(pi2);
        if(position.GetType() == "Pipe"){
            System.out.println("You need to stand on a pump");
            return ;
        }
        Pipe pi = (Pipe)position;
        pu.Disconnect(pi);
    }
}
