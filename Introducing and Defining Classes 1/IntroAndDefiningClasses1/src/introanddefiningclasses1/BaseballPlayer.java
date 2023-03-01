package introanddefiningclasses1;

/**
 *
 * @author roanm
 */
class BaseballPlayer {

    private String name;
    private String team;
    private int homeRuns;
    private double batAvg;

    //constructors    
    public BaseballPlayer(String name) {
        this.name = name;
    }

    public BaseballPlayer(String name, String team, int homeRuns, double batAvg) {
        this(name);
        this.team = team;
        this.homeRuns = homeRuns;
        this.batAvg = batAvg;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public double getBattingAverage() {
        return batAvg;
    }

    public void setBatAvg(double batAvg) {
        this.batAvg = batAvg;
    }

    public String toString() {
        return "BaseballPlayer{" + "name=" + name + ", team=" + team + 
                ", homeRuns=" + homeRuns + ", batAvg=" + batAvg + '}';
    }

}
