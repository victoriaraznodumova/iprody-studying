package lesson14;

public class AttendanceLog {
    private String userId;
    private String timestamp;
    public AttendanceLog(String userId, String timestamp) {
        this.userId = userId;
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "(\"" + userId + "\", " +
                "\"" + timestamp + "\")";
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}