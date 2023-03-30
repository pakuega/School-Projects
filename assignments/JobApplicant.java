package assignments;

public class JobApplicant {
	private String name;
    private String phone;
    private boolean hasWordSkill;
    private boolean hasSpreadsheetSkill;
    private boolean hasDatabaseSkill;
    private boolean hasGraphicsSkill;
    public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g) {
    	this.name = name;
    	this.phone = phone;
    	this.hasWordSkill = w;
    	this.hasSpreadsheetSkill = s;
    	this.hasDatabaseSkill = d;
    	this.hasGraphicsSkill = g;
    }
    public String getName() {
		return this.name;
    }
    public String getPhone() {
		return this.phone;
    }
    public boolean getHasWordSkill() {
		return this.hasWordSkill;
    }
    public boolean getHasSpreadsheetSkill() {
		return this.hasSpreadsheetSkill;
    }
    public boolean getHasDatabaseSkill() {
		return this.hasDatabaseSkill;
    }
    public boolean getHasGraphicsSkill() {
		return this.hasGraphicsSkill;
    }


}
