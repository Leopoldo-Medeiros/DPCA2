package investor;


public class Investor<StockMarket> {
    private String id;
    private String investName;
    private int shares;

  
    protected Investor(InvestorBuilder builder) {
        this.id = builder.id;
        this.investName = builder.name;
        this.shares = builder.shares;
    }

    public String getId() {
        return id;
    }

    public String getInvestorName() {
        return investName;
    }
    
    public int getShares() {
        return shares;
    }

    @Override
    public String toString() {
    	String text = "Name; " + investName + " shares: " + shares;
    	return text;
    }
    
}
