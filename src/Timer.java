package src;

public class Timer {
    private int duration;
    public void Tick(){
        System.out.println("Timer is ticking.");
    };

    public int GetDuration() {
        return duration;
    }
}
