package singleton;

public class Controller {
    public static void main(String[] args) throws NullPointerException {
        Employee emp1 = new Employee("E-01");
        Employee emp2 = new Employee("E-234");

        emp1.giveAttendance();
        emp2.giveAttendance();
        emp1.giveAttendance();
    }
}
