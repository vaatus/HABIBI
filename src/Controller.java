package src;

import java.util.ArrayList;
import java.util.Random;
public class Controller {
    private Team plumbers;
    private Team saboteurs;
    private Timer timer;
    private PipeSystem pipe_system;

    //Controller class constructor
    public Controller() {
        pipe_system = new PipeSystem();
        plumbers = new Team();
        saboteurs = new Team();
    }
    public void BreakPump(){
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        pipe_system.Break(randomNumber);
    }
    public void StartGame(){
        System.out.println("StartGame()");
        System.out.println("The game will start in 5 seconds.");
        timer = new Timer();
//        while (timer.GetDuration() >= 0) {
//            timer.Tick();
//        }
    }
    public void EndGame(){
        if (timer.GetDuration() == 0) {
            AnnounceWinner();
        }
    }
    public void AddToTeam(int i){
        System.out.println("AddToTeam()");
        if (i==1) {
            Plumber p1 = new Plumber();
            plumbers.AddMember(p1);
            System.out.println("A player was added to the plumbers team");
            return;
        }
        if (i==2){
            Saboteur p1 = new Saboteur();
            saboteurs.AddMember(p1);
            System.out.println("A player was added to the saboteurs team");
            return;
        }
        System.out.println("There are only 2 teams");
    }
    public void AnnounceWinner(){
        if (pipe_system.GetWaterTransferred() > pipe_system.GetLeakage()) {
            System.out.println("The plumbers win!");
        } else if (pipe_system.GetWaterTransferred() < pipe_system.GetLeakage()){
            System.out.println("The saboteurs win!");
        } else {
            System.out.println("Draw!");
        }
    }
    public void AddPipe(){
        pipe_system.AddPipe();
    }

    public void SelectPlayer(char team, int player) {

        switch (team){
            case 's':
                System.out.println("SelectPlayer() selects the Saboteur team");
                saboteurs.SelectPlayer(player);
                break;
            case 'p':
                System.out.println("SelectPlayer() selects the Plumber team");
                plumbers.SelectPlayer(player);
                break;
            default:
                System.out.println("There are only two teams: 's' -> saboteurs/ 'p' -> plumbers");
                break;
        }
    }

    public void TransferWater(){
        pipe_system.TransferWater();
    }
}