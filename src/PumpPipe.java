package src;

public interface PumpPipe {
    public abstract String  GetType();
    public  abstract void ChangeState();
    public abstract boolean GetWorking();

    public abstract int GetID();

    public abstract void SetFree();
}
