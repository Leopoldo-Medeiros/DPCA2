package investor;

import java.util.Random;

public class InvestorBuilder {

    Random rand = new Random();
    int low = 1000;
    int high = 10000;
  
   
    protected String id;
    protected int shares;
    protected String name;
    protected int budget;
    
    public InvestorBuilder(String name) {
    	this.name = name;
    }
    
    public InvestorBuilder setInvestorId(String id) {
    	this.id = id;
    	return this;
    }
    
public Investor build() {
    	this.shares = 0;
    	this.budget = rand.nextInt(high-low) + low;
    	return new Investor(this);
    }
    
}
