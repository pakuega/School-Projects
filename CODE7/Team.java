package CODE7;

public class Team {
	   private String name;
	   private String sport;
	   private String mascot;
	   public final static String MOTTO = "Sportmanship";
	   public Team(String name, String sport, String mascot) {

	       this.name = name;
	       this.sport = sport;
	       this.mascot = mascot;
	   }
	   public String getName() {
	       return name;
	   }
	   public String getSport() {
	       return sport;
	   }
	   public String getMasoct() {
	       return mascot;
	   }

	}