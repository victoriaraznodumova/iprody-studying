package lesson14;

public class AttendanceLog {
    private String user_id;
    private String timestamp;
    public AttendanceLog(String user_id, String timestamp) {
        this.user_id = user_id;
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "(\"" + user_id + "\", " +
                "\"" + timestamp + "\")";
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}