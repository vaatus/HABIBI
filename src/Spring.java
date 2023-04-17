package src;

public class Spring extends ActiveElement{
    Pipe outgoing=new Pipe();
    @Override
    public int TransferWater() {
        return outgoing.GetOutgoing().TransferWater();
    }
}
