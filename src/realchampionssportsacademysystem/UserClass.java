package realchampionssportsacademysystem;

public class UserClass {    
    
    private String userID;
    private String userAccName;    
    private String userName;    
    private String userPassword;
    private String userDateJoined;
    private String userContact;
    private String userAddress;
    private String userCenter;

    public UserClass(String userID, String userAccName, String userName, String userPassword, String userDateJoined, String userContact, String userAddress, String userCenter) {
        this.userID = userID;
        this.userAccName = userAccName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userDateJoined = userDateJoined;
        this.userContact = userContact;
        this.userAddress = userAddress;
        this.userCenter = userCenter;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserAccName() {
        return userAccName;
    }

    public void setUserAccName(String userAccName) {
        this.userAccName = userAccName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDateJoined() {
        return userDateJoined;
    }

    public void setUserDateJoined(String userDateJoined) {
        this.userDateJoined = userDateJoined;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserCenter() {
        return userCenter;
    }

    public void setUserCenter(String userCenter) {
        this.userCenter = userCenter;
    }
    
    

    
}
