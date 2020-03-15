package main.java.com.learning.day2_java2.q7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/***
 * A simple class which stores time as seconds and converts it to minutes, hours and days.
 */
public class Seconds {

    private BigDecimal seconds;

    public Seconds(String seconds) {
        this.seconds = new BigDecimal(seconds);
    }

    public String toMinutes(){
        return seconds.divide(new BigDecimal("60"),5, RoundingMode.HALF_DOWN).toString();
    }

    public String toHours()
    {
        return seconds.divide(new BigDecimal("3600"),5,RoundingMode.HALF_DOWN).toString();
    }

    public String toDays()
    {
        return seconds.divide(new BigDecimal("86400"),5,RoundingMode.HALF_DOWN).toString();
    }

    @Override
    public String toString() {
        return "Seconds : " + seconds + "\n" +
                "Minutes : " + toMinutes() + "\n" +
                "Hours : " + toHours() + "\n"+
                "Days : " + toDays() + "\n";
    }
}
