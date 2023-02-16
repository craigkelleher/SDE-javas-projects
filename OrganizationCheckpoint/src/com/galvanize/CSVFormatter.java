package com.galvanize;

public class CSVFormatter implements Formatter{
    @Override
    public String format(Booking booking) {
        String roomType = booking.getRoomTypeString();
        int roomNumber = Integer.parseInt(booking.getRoomNumber());
        return String.format("type,room number,start time,end time\n%s,%s,%s,%s",
                roomType, roomNumber, booking.getStartTime(), booking.getEndTime());
    }
}

