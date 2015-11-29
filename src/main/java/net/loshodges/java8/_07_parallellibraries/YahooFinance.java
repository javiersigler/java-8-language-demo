package net.loshodges.java8._07_parallellibraries;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class YahooFinance {
    protected static Map<String, Double> prices =  Collections.unmodifiableMap(new HashMap<String, Double>() {
        {
            put("AMD", 100.0);
            put("HPQ", 200.0);
            put("IBM", 200.0);
            put("TXN", 200.0);
            put("VMW", 200.0);
            put("XRX", 200.0);
            put("AAPL", 200.0);
            put("ADBE", 200.0);
            put("AMZN", 200.0);
            put("CRAY", 200.0);
            put("CSCO", 200.0);
            put("DELL", 200.0);
            put("GOOG", 200.0);
            put("INTC", 200.0);
            put("INTU", 600.0);
            put("MSFT", 600.0);
            put("ORCL", 600.0);
            put("TIBX", 600.0);
            put("VRSN", 600.0);
            put("YHOO", 600.0);
            put("BLKB", 600.0);
            put("TEF", 499.0);
        }
    });

    public static double getPrice(final String ticker) {
        try {
            Thread.sleep(500);
        } catch (Exception ex) {
        }
        return prices.get(ticker);
    }
}
