package lesson14;

public class Main {
    public static void main(String[] args) {
        AttendanceLogger attendanceLogger = new AttendanceLogger();
        attendanceLogger.register("user1", "09:15");
        attendanceLogger.register("user2", "10:00");
        attendanceLogger.register("user1", "09:45");
        attendanceLogger.register("user3", "11:30");
        attendanceLogger.register("user2", "10:20");
        attendanceLogger.register("user4", "14:10");
        attendanceLogger.register("user1", "09:55");
        attendanceLogger.register("user2", "10:45");
        attendanceLogger.register("user4", "14:25");
        attendanceLogger.register("user3", "11:50");
        attendanceLogger.register("user5", "15:00");
        attendanceLogger.register("user1", "16:30");
        attendanceLogger.register("user3", "11:59");
        System.out.println(attendanceLogger);
        System.out.println(attendanceLogger.calcFrequency());
        System.out.println(attendanceLogger.popularHour());
    }
}