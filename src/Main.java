import java.util.Random;

public class Main {
    public static void main(String[] args) {
        League league = new League("A-League");
        league.createLeague();
        season(league);
        System.out.println("\n\n");
        table(league);

    }

    public static void season(League league){
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = i + 1; j < 10; j++) {
                match(league.getTeam(i), league.getTeam(j));
            }
        }
        System.out.println(" \n\n\n"+league.getName() + " Season Overview");
        for(int i = 0; i < 10; i++){
            Team currentTeam = league.getTeam(i);
            System.out.println(currentTeam.getTeamName()+ " (" + currentTeam.getWins()
            +"," + currentTeam.getLosses() + "," + currentTeam.getTies() + ")"
            + " Points: " + currentTeam.getPoints() + "\n");
        }
    }

    public static void match(Team t1, Team t2){
        int teamOneScore = play(t1);
        int teamTwoScore = play(t2);
        System.out.println("---Match---");
        System.out.println(t1.getTeamName() +" (" + t1.getWins() +"," + t1.getTies()
                + "," + t1.getLosses() + ")" + " vs " +t2.getTeamName() + " (" + t2.getWins()
                +"," + t2.getTies() + "," + t2.getLosses() + ")");
        System.out.println("Score: " + t1.getTeamName() + ": " + teamOneScore + "   " +
        t2.getTeamName() + ": " + teamTwoScore);

        t1.setTeamGoals(t1.getTeamGoals() + teamOneScore);
        t1.setGoalsAllowed(t1.getGoalsAllowed() + teamTwoScore);

        t2.setTeamGoals(t2.getTeamGoals() + teamTwoScore);
        t2.setGoalsAllowed(t2.getGoalsAllowed() + teamOneScore);

        if(teamOneScore > teamTwoScore){
            t1.setWins(t1.getWins() + 1);
            t2.setLosses(t2.getLosses() + 1);
            t1.setPoints(t1.getPoints() + 3);
        }else if (teamOneScore == teamTwoScore){
            t1.setTies(t1.getTies() + 1);
            t2.setTies(t2.getTies() + 1);

            t1.setPoints(t1.getPoints() + 1);
            t2.setPoints(t2.getPoints() + 1);
        }else{
            t2.setWins(t2.getWins() + 1);
            t1.setLosses(t1.getLosses() +1);

            t2.setPoints(t2.getPoints() + 3);
        }

    }

    public static int play(Team team){
        int score = 0;
        Random random = new Random();
        Player currentPlayer;
        for(int i = 0; i < 5; i++){
            int ranPlayer = random.nextInt(0,10);
            int success = random.nextInt(1,10);
            currentPlayer =  team.getPlayer(ranPlayer);

            if(currentPlayer.getPosition().equals("Forward")){
                if (success <= 4){
                    score++;
                    currentPlayer.setGoals(currentPlayer.getGoals() + 1);
                }

            }else if(currentPlayer.getPosition().equals("Midfielder")){
                if (success <= 2){
                    score++;
                    currentPlayer.setGoals(currentPlayer.getGoals() + 1);
                }
            }else{
                if(success == 1){
                    score++;
                    currentPlayer.setGoals(currentPlayer.getGoals() + 1);
                }
            }
        }
        return score;
    }

    public static void table(League league){
        tableOrder(league);

        Team currentTeam;
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s %2s %2s %2s %3s %3s %3s %3s%n",
                "Team", "W", "D", "L", "GF", "GA", "GD", "PTS");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < 10; i++){
            currentTeam = league.getTeam(i);
            System.out.printf("%-20s %2d %2d %2d %3d %3d %3d %3d%n",
                    currentTeam.getTeamName(), currentTeam.getWins(), currentTeam.getTies(),
                    currentTeam.getLosses(), currentTeam.getTeamGoals(), currentTeam.getGoalsAllowed(),
                    currentTeam.getGoalDifference(), currentTeam.getPoints());
        }

    }


    public static void tableOrder(League league) {
        int n = 10;
        Team[] arr= league.getTeams();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getPoints() > arr[maxIndex].getPoints()) {
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the current element
            Team temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        league.setTeams(arr);
    }



}







