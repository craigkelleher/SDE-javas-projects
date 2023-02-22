package com.galvanize;

// check if input is 0, return now if true.
// data structure for each duration type and the time in seconds
// hold the number of seconds for each duration type
// create variable to hold output string | create a StringBuilder
// loop through the times array
// append a Unit of time to the result string for any non-zero value
// append the count and unit of time to the result string
// if it's not the first unit of time being appended, add comma or 'and'
public class HumanReadableDurationFormat {
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        String[] units = {"year", "day", "hour", "minute", "second"};
        int[] times = {31536000, 86400, 3600, 60, 1};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times.length; i++) {
            if (seconds >= times[i]) {
                int count = seconds / times[i];
                seconds = seconds % times[i];
                result.append(result.toString().equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        .append(count).append(" ").append(units[i]).append(count > 1 ? "s" : "");
            }
        }
        return result.toString();
    }
}