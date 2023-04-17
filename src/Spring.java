package src;

public class Spring extends ActiveElement{
    Pipe outgoing;
    @Override
    public int TransferWater() {
        return outgoing.GetOutgoing().TransferWater();
    }
}
