package singleton;

public class Employee implements IdGetter{
    private final String id;
    public Employee(String id){
        this.id = id;
    }
    public void giveAttendance() throws NullPointerException{
        AttendanceMachine attendanceMachine = AttendanceMachine.getAttendanceMachine();
        System.out.println(attendanceMachine.giveAttendance(this));
    }

    @Override
    public String getId(){
        return id;
    }
}
