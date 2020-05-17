package Investor;

import java.util.Map;

public class Investor<StockMarket> extends InvestorBuilder {
    private final long id;
    private String investName;

    public Investor(long id) {
        super();

        this.id = id;
    }

    public Investor(long id, String investName) {

        this.id = id;
        this.investName = investName;
    }

    public long getId() {
        return id;
    }

    public String getInvestorName() {
        return investName;
    }

    public void setCompName(String investName) {
        this.investName = investName;
    }

    public String getInvestName() {
        return investName;
    }

    public Investor setInvestName(String s) {
        this.investName = s;
        return null;
    }

    public void update(Map<String, Double> stock) {
        System.out.println("StockMarket: stock is changed:");
        stock.forEach((symbol, value) -> System.out.println(symbol + " -€" + value));
    }
}
class StockViewer<StockMarket> extends InvestorBuilder {

    public void update(Map<String, Double> stock) {
        System.out.println("StockMarket: stock is changed:");
        stock.forEach((symbol, value) -> System.out.println(symbol + " -€" + value));
    }
}
