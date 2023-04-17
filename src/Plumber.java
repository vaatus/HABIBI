package src;

public class Plumber extends Player {
    private boolean has_pump;

    public Plumber(){
        position=null;
    }

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

    public void ConnectPipe(Pump p1, Pump p2) {
        System.out.println("ConnectPipe()");
        if(position.GetType() == "Pump"){
            System.out.println("You need to stand on a pipe");
            return ;
        }
        Pipe pi = (Pipe)position;
        pi.Connect(p1,p2);
    }

    public void InsertPump() {
        System.out.println("InsertPump()");
        if(position.GetType() == "Pump"){
            System.out.println("You're already standing on a Pump");
            return ;
        }
        Pipe p=(Pipe) position;
        Pump pump=p.GetActiveElementBegin();
        Pump pump1=p.GetActiveElementEnd();
        p=null;
        Pipe p1=new Pipe();
        Pipe p2=new Pipe();
        position = new Pump(p1, p2);
        p1.Connect((Pump) position,pump);
        p2.Connect((Pump) position,pump1);
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

    public void DisconnectPipe(Pump p1, Pump p2) {
        if(position.GetType() == "Pump"){
            System.out.println("You need to stand on a pipe");
            return;
        }
        Pipe pi = (Pipe)position;
        pi.Disconnect(p1,p2);
    }
}
