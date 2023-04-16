import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private Player current_selected_player;
    public void SelectPlayer(int p){
        System.out.println("SelectPlayer()");
        current_selected_player = players.get(p-1);
    };
    public void AddMember(Player player){
        System.out.println("AddMember()");
        players.add(player);
    };
}