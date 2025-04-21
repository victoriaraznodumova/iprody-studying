package lesson14;

import java.util.*;

public class AttendanceLogger {
    public ArrayList<AttendanceLog> logList = new ArrayList<>();
    public void register(String user_id, String timestamp){
        logList.add(new AttendanceLog(user_id, timestamp));
    }
    //выполняем сортировку по значениям
    Comparator<Map.Entry<String, Integer>> valueSortComparator = new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            //сравниваем по значениям, чтобы они были по возрастанию
            int valueComparison = o1.getValue().compareTo(o2.getValue());
            if (valueComparison == 0){
                try{
                    //сравниваем по ключам, чтобы они были по возрастанию
                    return Integer.compare(Integer.parseInt(o1.getKey()), Integer.parseInt(o2.getKey()));
                }
                catch (NumberFormatException e){
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
            return valueComparison;
        }
    };
    //выполняем сортировку по ключам в случае, когда они являются userId
    Comparator<Map.Entry<String, Integer>> keySortComparator = new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            int valueComparison = 0;
            try{
                valueComparison = Integer.compare(Integer.parseInt(o1.getKey()), Integer.parseInt(o2.getKey()));
            }
            catch (NumberFormatException e){
                valueComparison = o1.getKey().compareTo(o2.getKey());
            }
            //ключи HashMap не могут дублироваться, поэтому можем не сортировать одинаковые ключи по значениям
            return valueComparison;
        }
    };
    public ArrayList<Map.Entry<String, Integer>> calcFrequency(){  //public Map<String, Integer> calcFrequency(){
        Map<String, Integer> frequency = new HashMap<String, Integer>();
        for (AttendanceLog log: logList) {
            if (frequency.containsKey(log.getUserId())){
                frequency.replace(log.getUserId(), frequency.get(log.getUserId()) + 1);
            }
            else{
                frequency.put(log.getUserId(),1);
            }
        }
        ArrayList<Map.Entry<String, Integer>> mapList = new ArrayList<>(frequency.entrySet());
        mapList.sort(keySortComparator);
        return mapList;
    }
    public String popularHour(){
        Map<String, Integer> frequency = new HashMap<>();
        for (AttendanceLog log: logList) {
//            String hour = log.getTimestamp().split(":")[0] + ":00";
            String hour = log.getTimestamp().substring(0, 2);
            frequency.put(hour, frequency.getOrDefault(hour, 0) + 1);
        }
        ArrayList<Map.Entry<String, Integer>> freqList = new ArrayList<>(frequency.entrySet());
        freqList.sort(keySortComparator);
        Map.Entry<String, Integer> popularHour = freqList.get(0);
        return popularHour.getKey() + ":00";
    }
    @Override
    public String toString() {
        return logList.toString();
    }
}