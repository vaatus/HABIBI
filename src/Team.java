package src;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;

    public Team() {
        players=new ArrayList<>();
    }
    private int current_selected_player;
    public Player SelectPlayer(int p){
        System.out.println("SelectPlayer() in the team chosen");
        if(p > players.size())
        {
            System.out.println("Please select an existing player");
        }
        else if(p == current_selected_player)
        {
            System.out.println("the player is already selected");
        }
        current_selected_player = p;
        System.out.println("The player has been selected.");
        return players.get(p-1);
    };
    public void AddMember(Player player){
        System.out.println("AddMember()");
        players.add(player);

    };
}