package Opgave05;

public class Stock {
//    Atributter
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
// Constructor
    public Stock (String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
// getChangePercent metode
    public double getChangePercent (){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
// print metode
    public void print (){
        System.out.println(symbol + " " + name);
        System.out.println(previousClosingPrice + " " + currentPrice);
        System.out.println(getChangePercent());
    }
}
