package Opgave05;

public class StockTest {
    public static void main(String[] args) {
//        Opretter stock
        Stock stock = new Stock("ORCL", "Oracle",34.5, 34.35);

//        Printer variabler til konsollen
        stock.print();
    }
}
