package com.galvanize;

public class JSONFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String roomType = booking.getRoomTypeString();
        int roomNumber = Integer.parseInt(booking.getRoomNumber());
        return String.format("{\n" +
                "  \"type\": \"%s\",\n" +
                "  \"roomNumber\": %s,\n" +
                "  \"startTime\": \"%s\",\n" +
                "  \"endTime\": \"%s\"\n" +
                "}", roomType, roomNumber, booking.getStartTime(), booking.getEndTime());
    }
}
