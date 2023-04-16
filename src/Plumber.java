public class Plumber extends Player {
    private boolean has_pump;

    public void FixPump() {
        System.out.println("FixPump()");
        if(position.GetType() == "Pipe"){
            System.out.println("This is not a pump");
            return;
        }
        Pump pu = (Pump)position;
        if(pu.GetWorking()){
            System.out.println("The pump is already working");
            return;
        }
        pu.ChangeState();
        System.out.println("The pump is fixed");
    }

    public void FixPipe() {
        System.out.println("FixPipe()");
        if(position.GetType() == "Pump"){
            System.out.println("This is not a pipe");
            return;
        }

        Pipe pi = (Pipe)position;
        if(pi.GetWorking()){
            System.out.println("The pipe is already working");
            return;
        }
        pi.ChangeState();
        System.out.println("The pipe is fixed");
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

    public void PickupPump() {
        System.out.println("PickupPump()");
        if (has_pump){
            System.out.println("Plumber already has pump");
            return;
        }
        if(position.GetType() == "Pump")
        {
            System.out.println("Please move to a pipe next to one of the cisterns.");
            return;
        }
        Pipe pi = (Pipe)position;
        if(pi.GetID() < 100)
        {
            System.out.println("Please move to a pipe next to one of the cisterns.");
            return;
        }
        Cistern c = (Cistern) pi.GetOutgoing();
        c.RemovePump();
        this.has_pump = true;

    }

    public void DisconnectPipe(Pump pu) {
        if(position.GetType() == "Pipe"){
            System.out.println("You need to stand on a pump");
            return;
        }
        Pipe pi = (Pipe)position;
        pi.Disconnect(pu);
    }
}
