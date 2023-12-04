package realchampionssportsacademysystem;

public class SportsClass {
    private String sportID; 
    private String sportName;       
    private String sportCenterID;
    private String sportCenterName;

    public SportsClass(String sportID, String sportName, String sportCenterID, String sportCenterName) {       
        this.sportID = sportID;
         this.sportName = sportName;
        this.sportCenterID = sportCenterID;
        this.sportCenterName = sportCenterName;
    }

    public String getSportCenterName() {
        return sportCenterName;
    }

    public void setSportCenterName(String sportCenterName) {
        this.sportCenterName = sportCenterName;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getSportID() {
        return sportID;
    }

    public void setSportID(String sportID) {
        this.sportID = sportID;
    }

    public String getSportCenterID() {
        return sportCenterID;
    }

    public void setSportCenterID(String sportCenterID) {
        this.sportCenterID = sportCenterID;
    }
    
    
}
