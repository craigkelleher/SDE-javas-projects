package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class Booking {
    public enum RoomType {
        CONFERENCE_ROOM, AUDITORIUM, SUITE, CLASSROOM
    };

    private RoomType roomType;
    private final String roomNumber;
    private final String startTime;
    private final String endTime;

    private final Map<RoomType, String> enumToString = new HashMap<>() {{
        put(RoomType.AUDITORIUM, "Auditorium");
        put(RoomType.CONFERENCE_ROOM, "Conference Room");
        put(RoomType.CLASSROOM, "Classroom");
        put(RoomType.SUITE, "Suite");
    }};

    public Booking(RoomType type, String roomNumber, String startTime, String endTime) {
        this.roomType = type;
        this.roomNumber = roomNumber;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public String getRoomTypeString() {
        return enumToString.get(this.roomType);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public static Booking parse(String bookingCode) {
        String[] parts = bookingCode.split("-");
        char firstChar = parts[0].charAt(0);
        String roomNumber = parts[0].substring(1);
        String startTime = parts[1];
        String endTime = parts[2];

        RoomType type = null;
        switch (firstChar) {
            case 'r':
                type = RoomType.CONFERENCE_ROOM;
                break;
            case 'a':
                type = RoomType.AUDITORIUM;
                break;
            case 's':
                type = RoomType.SUITE;
                break;
            case 'c':
                type = RoomType.CLASSROOM;
                break;
        }
        return new Booking(type, roomNumber, startTime, endTime);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "roomType=" + roomType +
                ", roomNumber='" + roomNumber + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}