package singleton;

//import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class AttendanceMachine {
    private static AttendanceMachine attendanceMachine = new AttendanceMachine();
    private HashMap<String, Boolean> attendance = new HashMap<>();
    private AttendanceMachine(){

    }

    public static AttendanceMachine getAttendanceMachine(){
        return attendanceMachine;
    }
    public String giveAttendance(IdGetter employee){
        if (attendance.containsKey(employee.getId()) == true){
            return "Attendance for " + employee.getId() + " is already given.";
        }
        else {
            attendance.put(employee.getId(), true);
            return "Attendance for " + employee.getId() + " is successfully given.";
        }
    }
}
