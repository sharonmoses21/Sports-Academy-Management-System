package realchampionssportsacademysystem;

public class CoachClass extends UserClass{
    
    private String sport;
    private double hourlyRate;

    public CoachClass( String userID, String userAccName, String userName, String userPassword, String userDateJoined, String userContact, String userAddress, String userCenter,String sport, double hourlyRate) {
        super(userID, userAccName, userName, userPassword, userDateJoined, userContact, userAddress, userCenter);
        this.sport = sport;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
    
}
