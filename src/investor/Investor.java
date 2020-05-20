package investor;


public class Investor {
    private String id;
    private String investName;
    private int shares;
    private int budget;

  
    protected Investor(InvestorBuilder builder) {
        this.id = builder.id;
        this.investName = builder.name;
        this.shares = builder.shares;
        this.budget = builder.budget;
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
    
    public int getBudget() {
        return budget;
    }

    @Override
    public String toString() {
    	String text = "Name; " + investName + " budget: " + budget + " shares: " + shares;
    	return text;
    }
    
}
