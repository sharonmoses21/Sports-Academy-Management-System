package realchampionssportsacademysystem;

public class SportsScheduleClass {
    private String sportsId;
    private String sportsName;
    private String sportsDay;
    private String startTime;
    private String endTime;

    public SportsScheduleClass(String sportsId, String sportsName, String sportsDay, String startTime, String endTime) {
        this.sportsId = sportsId;
        this.sportsName = sportsName;
        this.sportsDay = sportsDay;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSportsId() {
        return sportsId;
    }

    public void setSportsId(String sportsId) {
        this.sportsId = sportsId;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public String getSportsDay() {
        return sportsDay;
    }

    public void setSportsDay(String sportsDay) {
        this.sportsDay = sportsDay;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    
    
}
