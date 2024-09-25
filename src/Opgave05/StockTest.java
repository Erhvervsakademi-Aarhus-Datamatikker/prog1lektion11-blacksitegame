package Opgave05;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle",34.5, 34.35);

        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        System.out.println("Previous Closing price: " + stock.previousClosingPrice);
        System.out.println("Current price: " + stock.currentPrice);
        System.out.println("percentage gain or loss: " + stock.getChangePercent());
    }
}
