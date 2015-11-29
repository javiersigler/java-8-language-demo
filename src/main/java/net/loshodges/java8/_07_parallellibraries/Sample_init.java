package net.loshodges.java8._07_parallellibraries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Sample_init {

    public static <T> T timeIt(Supplier<T> function){
        long initialNanoSeconds = System.nanoTime();
        T value = function.get();
        long elapse_time = System.nanoTime() - initialNanoSeconds;
        System.out.println("Seconds: " + elapse_time / (1000.0 * 1000.0 * 1000.0));
        return value;
    }

    public static StockInfo dummy = new StockInfo("", 0.0);

    public static StockInfo findImperative(List<String> symbols){
        List<StockInfo> stocks = new ArrayList<>(symbols.size());
        for(String symbol : symbols){
            stocks.add(StockUtil.getPrice(symbol));
        }

        List<StockInfo> listOfStocksLessThan500 = new ArrayList<>();
        for(StockInfo stockInfo: stocks){
            if ( StockUtil.isPriceLessThan(500).test(stockInfo)){
                listOfStocksLessThan500.add(stockInfo);
            }
        }

        StockInfo highPriced = dummy;
        for(StockInfo stockInfo: listOfStocksLessThan500){
            highPriced = StockUtil.pickHigh(highPriced, stockInfo);
        }

        return highPriced;
    }
   public static void main(String[] args) {
        StockInfo highPriced = timeIt(()-> findImperative(Tickers.symbols));
        System.out.println(highPriced);
    }
}
