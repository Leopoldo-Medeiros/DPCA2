package investor;

import java.util.Random;

public class InvestorBuilder {

    Random rand = new Random();
    int low = 1000;
    int high = 10000;
    int result = rand.nextInt(high-low) + low;
   
    protected String id;
    protected int shares;
    protected String name;
    
    public InvestorBuilder(String name) {
    	this.name = name;
    }
    
    public InvestorBuilder setInvestorId(String id) {
    	this.id = id;
    	return this;
    }
    
public Investor build() {
    	this.shares = 0;
    	return new Investor(this);
    }
    
}
