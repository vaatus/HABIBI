import java.util.ArrayList;
import java.util.Random;
public class Controller {
    private Team plumbers;
    private Team saboteurs;
    private Timer timer;
    private PipeSystem pipe_system;
    private ArrayList<Cistern> cisterns;
    public void BreakPump(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        pipe_system.Break(randomNumber);
    };
    public void StartGame(){
        while (timer.GetDuration() >= 0) {
            timer.Tick();
        }
    };
    public void EndGame(){
        if (timer.GetDuration() == 0) {
            AnnounceWinner();
        }
    };
    public void AddToTeam(int i){
        Player p1 = new Player();
        if (i==1) {
            plumbers.AddMember(p1);
        } else if (i==2){
            saboteurs.AddMember(p1);
        }
    };
    public void AnnounceWinner(){
        if (pipe_system.GetWaterTransferred() > pipe_system.GetLeakage()) {
            System.out.println("The plumbers win!");
        } else if (pipe_system.GetWaterTransferred() < pipe_system.GetLeakage()){
            System.out.println("The saboteurs win!");
        } else {
            System.out.println("Draw!");
        }
    };
    public void AddPipe(){
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        cisterns.get(randomNumber % cisterns.size()).AddPipe();
    };
}