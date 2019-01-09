package main.java.hello;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Greeter {
    public String sayHello() {
//        DateTime dt = DateTime.now(DateTimeZone.UTC);
        LocalDateTime localDateTime = new LocalDateTime();
        DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy hh:mm aa");
        String str = dtf.print(localDateTime);
        return "Hello world! It's currently " + str;
    }
}