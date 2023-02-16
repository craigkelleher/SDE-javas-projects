package com.galvanize;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    PrintStream original;
    ByteArrayOutputStream outContent;

    // This block captures everything written to System.out
    @BeforeEach
    public void setOut() {
        original = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    // This block resets System.out to whatever it was before
    @AfterEach
    public void restoreOut() {
        System.setOut(original);
    }

    @Test
    public void aTest() {
        // Write your tests here
        // outContent.toString() will give you what your code printed to System.out
        Formatter html = Application.getFormatter("html");
        Formatter csv = Application.getFormatter("csv");
        Formatter json = Application.getFormatter("json");
        assertTrue(html instanceof HTMLFormatter);
        assertTrue(csv instanceof CSVFormatter);
        assertTrue(json instanceof JSONFormatter);
    }

    @Test
    public void testCSV() {
        Booking book = new Booking(Booking.RoomType.AUDITORIUM, "111", "08:30am", "11:00am");
        CSVFormatter csv = new CSVFormatter();
        String expected =  "type,room number,start time,end time\n" +
                "Auditorium,111,08:30am,11:00am";
        String actual = csv.format(book);
        assertEquals(expected, actual);
    }

    @Test
    void invalidCSVOutput() {
        Booking book = new Booking(Booking.RoomType.AUDITORIUM, "111", "08:30am", "11:00am");
        CSVFormatter csv = new CSVFormatter();
        String incorrect =  "type,room number,start time,end time" +
                "Auditorium,111,08:30am,11:00am";
        assertNotEquals(incorrect, csv.format(book));
    }

    @Test
    public void testHTML() {
        Booking book = new Booking(Booking.RoomType.CONFERENCE_ROOM, "111", "08:30am", "11:00am");
        HTMLFormatter html = new HTMLFormatter();

        String expected =  "<dl>\n" +
                "  <dt>Type</dt><dd>Conference Room</dd>\n" +
                "  <dt>Room Number</dt><dd>111</dd>\n" +
                "  <dt>Start Time</dt><dd>08:30am</dd>\n" +
                "  <dt>End Time</dt><dd>11:00am</dd>\n" +
                "</dl>";

        String actual = html.format(book);
        assertEquals(expected, actual);
    }

    @Test
    void invalidHTMLOutput() {
        Booking book = new Booking(Booking.RoomType.CONFERENCE_ROOM, "111", "08:30am", "11:00am");
        HTMLFormatter html = new HTMLFormatter();
        String incorrect =  "<dl>" +
                "  <dt>Type</dt><dd>Conference Room</dd>" +
                "  <dt>Room Number</dt><dd>111</dd>" +
                "  <dt>Start Time</dt><dd>08:30am</dd>" +
                "  <dt>End Time</dt><dd>11:00am</dd>" +
                "</dl>";
        assertNotEquals(incorrect, html.format(book));
    }

    @Test
    public void testJSON(){
        Booking book = new Booking(Booking.RoomType.SUITE, "111", "08:30am", "11:00am");
        JSONFormatter json = new JSONFormatter();

        String expected = "{\n" +
                "  \"type\": \"Suite\",\n" +
                "  \"roomNumber\": 111,\n" +
                "  \"startTime\": \"08:30am\",\n" +
                "  \"endTime\": \"11:00am\"\n" +
                "}";

        String actual = json.format(book);
        assertEquals(expected, actual);
    }

    @Test
    void invalidJSONOutput() {
        Booking book = new Booking(Booking.RoomType.SUITE, "111", "08:30am", "11:00am");
        JSONFormatter json = new JSONFormatter();

        String badInput = "{" +
                "  \"type\": \"%s\",\n" +
                "  \"roomNumber\": \"%s\",\n" +
                "  \"startTime\": \"%s\",\n" +
                "  \"endTime\": \"%s\",\n" +
                "}";
        assertNotEquals(badInput, json.format(book));
    }

    @Test
    public void applicationRuns() {
        Application.main(new String[]{"r111-08:30am-11:00am", "html"});
        String actual = outContent.toString();
        String expected =  "<dl>\n" +
                "  <dt>Type</dt><dd>Conference Room</dd>\n" +
                "  <dt>Room Number</dt><dd>111</dd>\n" +
                "  <dt>Start Time</dt><dd>08:30am</dd>\n" +
                "  <dt>End Time</dt><dd>11:00am</dd>\n" +
                "</dl>\n";
        assertEquals(expected.replaceAll("\\s",""),actual.replaceAll("\\s",""));
    }
}