public class Player {
    private int overall;

    private int num;
    private String position;
    private String name;

    private int goals;

    public Player(int overall, int num, String position){
        this.overall = overall;
        this.num = num;
        this.position = position;
        this.name ="No Name";
        this.goals = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public int getOverall() {
        return overall;
    }

    public String getPosition() {
        return position;
    }

    public int getGoals() {
        return goals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void printPlayer(){
        System.out.println("Player Name: "+ this.name);
        System.out.println("Position: " + this.position);
        System.out.println("Overall: " + this.overall);
    }
}
