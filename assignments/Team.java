package assignments;

public class Team {
	private String name;
	  private String sport;
	  private String mascot;
	  public final String MOTTO = "Sportsmanship!";

	  public Team(String name, String sport, String mascot) {
	    this.name = name;
	    this.sport = sport;
	    this.mascot = mascot;
	  }

	  //method to set the school name
	  public String getName() {
	    return name;
	  }

	  //method to set the sport name
	  public String getSport() {
	    return sport;
	  }

	  //method to set the team name
	  public String getMascot() {
	    return mascot;
	  }
}
