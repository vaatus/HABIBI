public class Plumber extends Player {
    private boolean has_pump;

    public void FixPump() {
        System.out.println("FixPump()");
        if(position.GetType() == "Pipe"){
            System.out.println("This is not a pump");
            return ;
        }
        //Change pump working property to true
        Pump pu = (Pump)position;
        if(pu.GetWorking()){
            return;
        }
        pu.ChangeState();
    }

    public void FixPipe() {
        System.out.println("FixPipe()");
        if(position.GetType() == "Pump"){
            System.out.println("This is not a pipe");
            return ;
        }
        //Change pipe working property to true
        Pipe pi = (Pipe)position;
        if(pi.GetWorking()){
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
        pi.Connect(pu);
    }

    public void InsertPump() {
        System.out.println("InsertPump()");
        if(position.GetType() == "Pump"){
            System.out.println("You're already standing on a Pump");
            return ;
        }
        //Constructor needs to be created for Pump class
        position = new Pump(new Pipe(), new Pipe());
    }

    public void PickupPump(Cistern c) {
        System.out.println("PickupPump()");
        c.RemovePump();
        // Further implementation of the PickupPump function
        this.has_pump = true;
    }

    public void DisconnectPipe(Pump pu) {
        if(position.GetType() == "Pipe"){
            System.out.println("You need to stand on a pump");
            return ;
        }
        Pipe pi = (Pipe)position;
        pi.Disconnect(pu);
    }
}
