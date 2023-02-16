package com.galvanize;

class Application {
    public static Formatter getFormatter(String format) {
        switch (format) {
            case "json":
                return new JSONFormatter();
            case "html":
                return new HTMLFormatter();
            case "csv":
                return new CSVFormatter();
            default:
                throw new IllegalArgumentException("Invalid format: " + format);
        }
    }

    public static void main(String[] args) {
        Formatter formatter = getFormatter(args[1]);
        Booking booking = Booking.parse(args[0]);
        System.out.println(formatter.format(booking));
    }
}