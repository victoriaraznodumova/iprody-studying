package lesson14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AttendanceLogger {
    public ArrayList<AttendanceLog> logList = new ArrayList<>();
    public void register(String user_id, String timestamp){
        logList.add(new AttendanceLog(user_id, timestamp));
    }
    public Map<String, Integer> calcFrequency(){
        Map<String, Integer> frequency = new TreeMap<String, Integer>();
        for (AttendanceLog log: logList) {
            if (frequency.containsKey(log.getUser_id())){
                frequency.replace(log.getUser_id(), frequency.get(log.getUser_id()) + 1);
            }
            else{
                frequency.put(log.getUser_id(),1);
            }
        }
        return frequency;
    }
    public String popularHour(){
        Map<String, Integer> frequency = new TreeMap<>();
        for (AttendanceLog log: logList) {
            String hour = log.getTimestamp().split(":")[0] + ":00";
            frequency.put(hour, frequency.getOrDefault(hour, 0) + 1);
        }
        String mostPopularHour = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostPopularHour = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostPopularHour;
    }
    @Override
    public String toString() {
        return logList.toString();
    }
}