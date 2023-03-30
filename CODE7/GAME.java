package CODE7;

public class GAME {
	private Team team1;
    private Team team2;
    private String time;
    public GAME(Team t1, Team t2, String time) 
    {
       this.team1 = t1;
       this.team2 = t2;
       String a = team1.getSport();
       String b = team2.getSport();
       if (!a.equals(b)) {
           time = "Game cancelled!";
       } 
       else
       {
           this.time = time;
       }
    }
    public Team getTeam1() {
        return team1;
    }
    public Team getTeam2() {
        return team2;
    }
    public String getTime() {
        return time;
    }
public static void main(String args[]) {
    Team t1 = new Team("Team1", "Basketball", "Mascot1");
    Team t2 = new Team("Team2", "Cricket", "Mascot2");
    GAME g = new GAME(t1, t2, "Jul 13, 2019");
}
}

