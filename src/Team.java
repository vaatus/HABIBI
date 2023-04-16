import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private int current_selected_player;
    public void SelectPlayer(int p){
        System.out.println("SelectPlayer()");
        if(p > players.size())
        {
            System.out.println("Please select an existing player");
            return;
        }
        if(p == current_selected_player)
        {
            System.out.println("the player is already selected");
            return;
        }
        current_selected_player = p;
    };
    public void AddMember(Player player){
        System.out.println("AddMember()");
        players.add(player);

    };
}