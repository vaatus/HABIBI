package src;

import java.util.Scanner;

public class Main  {
    public static void main(String args[]){
        Controller c = new Controller();
        c.StartGame();
        c.AddToTeam(1);
        c.AddToTeam(2);
        c.SelectPlayer('s',1);
        c.SelectPlayer('p',2);
        c.SelectPlayer('s',1);
        c.SelectPlayer('h',2);
        Scanner scanner = new Scanner(System.in);
        Pipe pipe = new Pipe();
        int i=0;
        while (i < 5) {
            c.TransferWater();
            i++;
        }
    }

}
