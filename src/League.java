public class League {
    private String name;
    private Team[] teams;


    public League(String name){
        this.name = name;
        this.teams = new Team[10];
    }

    public String getName() {
        return name;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Team getTeam(int teamNum){
        return this.teams[teamNum];

    }

    public void createLeague(){
        String[] soccerTeamNames = {
                "Crimson Raptors FC",
                "Golden Eagles FC",
                "Silver Wolves SC",
                "Solar Flares FC",
                "Azure Knights UTD",
                "Scarlet Phoenixes",
                "Emerald Titans FC",
                "Griffins United",
                "Aqua Jaguars FC",
                "Cosmic Comets FC"
        };

        for(int i = 0; i <10; i++){
            this.teams[i] = new Team(soccerTeamNames[i]);
            this.teams[i].createTeam();

        }



    }
}
