package src;

import java.util.Scanner;

public class Main  {
    public static void main(String args[]){
        Controller c = new Controller();
        Pipe pipe = new Pipe();
        Pipe pipe1=new Pipe();
        Pump pump=new Pump(pipe,pipe1);
        player.Move(pump);
        player1.Move(pump);
        player.Move(pipe1);
        player.PuncturePipe();
        player.Move(pump);
        player1.Move(pipe1);
        player1.FixPipe();
        player.ChangePumpDirection(pipe1,pipe);
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        char c2=scanner.next().charAt(0);
        int i= scanner.nextInt();
        if (c2=='k') {
            c.StartGame();
            c.TransferWater();
            c.GetTimer().Tick();
        } else if (c2=='n') {
                c.AddToTeam(i);
        } else if (c2=='s') {
            System.out.println("Enter the ID of the player you want to select: ");
            int l= scanner.nextInt();
            if (i==1){
                Plumber player1=new Plumber();
                player1=(Plumber) c.SelectPlayer('p',l);
            } else if (i==2) {
                Saboteur player=new Saboteur();
                player= (Saboteur) c.SelectPlayer('s',l);
            }
        }
    }

}
