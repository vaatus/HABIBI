package src;

class Saboteur extends Player {

    public void PuncturePipe() {
        System.out.println("PuncturePipe()");
        if(position.GetType() == "Pump"){
            System.out.println("This is not a pipe");
            return;
        }

        Pipe pi = (Pipe)position;
        if(!pi.GetWorking()){
            System.out.println("The pipe is already punctured");
            return;
        }
        pi.ChangeState();
        System.out.println("The pipe is punctured");
    }
}

