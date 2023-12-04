package realchampionssportsacademysystem;

import java.io.File;
import java.util.ArrayList; 
import java.util.Scanner;

public class MainClass {

    public static LoginForm login = new LoginForm();
    public static AddAdminForm addAdmin = new AddAdminForm();
    public static AddCoachForm addCoach = new AddCoachForm();
    public static AddSportForm addSport = new AddSportForm();
    public static AddSportScheduleForm addSchedule = new AddSportScheduleForm();
    public static AdminMenuForm adminMenu = new AdminMenuForm();
    public static DisplayCoachForm displayCoach = new DisplayCoachForm();
    public static DisplayScheduleForm displaySchedule = new DisplayScheduleForm();
    public static DisplaySportsForm displaySport = new DisplaySportsForm();

    public static AdminClass adminLogin = null;
    public static AdminClass admin_Info = null;
    public static ArrayList<AdminClass> admin = new ArrayList<AdminClass>();

    public static CoachClass coach_Info = null;
    public static ArrayList<CoachClass> coach = new ArrayList<CoachClass>();

    public static SportsClass sport_Info = null;
    public static ArrayList<SportsClass> sport = new ArrayList<SportsClass>();

    public static SportsScheduleClass schedule_Info = null;
    public static ArrayList<SportsScheduleClass> schedule = new ArrayList<SportsScheduleClass>();

    public static void main(String[] args) {
        try {
            Scanner sAdmin = new Scanner(new File("admin.txt"));
            while (sAdmin.hasNext()) {
                String admin_ID = sAdmin.nextLine();
                String admin_AccName = sAdmin.nextLine();
                String admin_Username = sAdmin.nextLine();
                String admin_Password = sAdmin.nextLine();
                String admin_DateJoined = sAdmin.nextLine();
                String admin_Phone = sAdmin.nextLine();
                String admin_Address = sAdmin.nextLine();
                String admin_Center = sAdmin.nextLine();
                sAdmin.nextLine();
                AdminClass ac1 = new AdminClass(admin_ID, admin_AccName, admin_Username, admin_Password, admin_DateJoined, admin_Phone, admin_Address, admin_Center);
                admin.add(ac1);
            }
            sAdmin.close();
        } catch (Exception e) {
        }
        
        try {
            Scanner sCoach = new Scanner(new File("coach.txt"));
            while (sCoach.hasNext()) {
                String coach_ID = sCoach.nextLine();
                String coach_AccName = sCoach.nextLine();
                String coach_Username = sCoach.nextLine();
                String coach_Password = sCoach.nextLine();
                String coach_DateJoined = sCoach.nextLine();
                String coach_Phone = sCoach.nextLine();
                String coach_Address = sCoach.nextLine();
                String coach_Center = sCoach.nextLine();
                String coach_Sport = sCoach.nextLine();
                double coach_Rate = Double.parseDouble(sCoach.nextLine());
                sCoach.nextLine();
                CoachClass ac1 = new CoachClass(coach_ID, coach_AccName, coach_Username, coach_Password, coach_DateJoined, coach_Phone, coach_Address, coach_Center, coach_Sport, coach_Rate);
                coach.add(ac1);
            }
            sCoach.close();
        } catch (Exception e) {
        }

        try {
            Scanner sSport = new Scanner(new File("sport.txt"));
            while (sSport.hasNext()) {
                String sport_ID = sSport.nextLine();
                String sport_Name = sSport.nextLine();
                String sport_CenterID = sSport.nextLine();
                String sport_CenterName = sSport.nextLine();
                sSport.nextLine();
                SportsClass ac1 = new SportsClass(sport_ID, sport_Name, sport_CenterID, sport_CenterName);
                sport.add(ac1);
            }
            sSport.close();
        } catch (Exception e) {
        }

        try {

            Scanner sSchedule = new Scanner(new File("schedule.txt"));
            while (sSchedule.hasNext()) {
                String sport_ID = sSchedule.nextLine();
                String sport_Name = sSchedule.nextLine();
                String sport_Day = sSchedule.nextLine();
                String sport_StartTime = sSchedule.nextLine();
                String sport_EndTime = sSchedule.nextLine();
                sSchedule.nextLine();
                SportsScheduleClass ac1 = new SportsScheduleClass(sport_ID, sport_Name, sport_Day, sport_StartTime, sport_EndTime);
                schedule.add(ac1);
            }
            sSchedule.close();
        } catch (Exception e) {
        }
    }

}
