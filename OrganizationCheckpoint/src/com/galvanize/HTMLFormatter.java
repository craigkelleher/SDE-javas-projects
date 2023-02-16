package com.galvanize;

public class HTMLFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String roomType = booking.getRoomTypeString();
        int roomNumber = Integer.parseInt(booking.getRoomNumber());
        return String.format("<dl>\n" +
                "  <dt>Type</dt><dd>%s</dd>\n" +
                "  <dt>Room Number</dt><dd>%s</dd>\n" +
                "  <dt>Start Time</dt><dd>%s</dd>\n" +
                "  <dt>End Time</dt><dd>%s</dd>\n" +
                "</dl>", roomType, roomNumber, booking.getStartTime(), booking.getEndTime());
    }
}
