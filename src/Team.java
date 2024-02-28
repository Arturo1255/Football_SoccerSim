import java.util.Random;
public class Team {
    private Player[] players;

    private String teamName;

    private int wins;
    private int losses;

    private int ties;

    private int points;

    private int teamGoals;

    private int goalsAllowed;


    public Team(String teamName){
        this.players = new Player[11];
        this.teamName = teamName;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.teamGoals = 0;
        this.goalsAllowed = 0;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getPoints() {
        return points;
    }

    public int getLosses() {
        return losses;
    }

    public int getWins() {
        return wins;
    }

    public int getTies() {
        return ties;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getTeamGoals() {
        return teamGoals;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player getPlayer(int playerNum){
        return this.players[playerNum];
    }

    public void setPlayer(int playerNum, Player newPlayer){
        this.players[playerNum] = newPlayer;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public void setTeamGoals(int teamGoals) {
        this.teamGoals = teamGoals;
    }

    public int getGoalDifference(){
        return teamGoals - goalsAllowed;
    }


    public void createTeam(){
        Random random = new Random();
        for (int i = 0; i < 11; i++){
            int newOverall = random.nextInt(60,90);
            String playerPosition;
            if (i < 3){
                playerPosition = "Forward";
            }else if(i == 10){
                playerPosition = "Goal Keeper";
            }else if (i >= 3 && i < 6){
                playerPosition = "Midfielder";
            }else{
                playerPosition = "Defender";
            }
            this.players[i] = new Player(newOverall,i,playerPosition);
        }
    }

    public void printTeam(){
        for (Player player:players) {
            player.printPlayer();
        }
    }
}
