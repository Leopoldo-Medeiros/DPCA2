package company;

import java.util.ArrayList;
import java.util.List;

import investor.InvestorBuilder;

public class Company {
	 private String id;
	    private String compName;
	    private int price;
	    private int shares;
    
	    protected Company(CompanyBuilder builder) {
	    	this.id = builder.id;
	    	this.compName = builder.compName;
	    	this.price = builder.price;
	    	this.shares = builder.shares;
	    }
	    
    public String getId() {
        return id;
    }

    public String getCompName() {
        return compName;
    }

    public int getPrice() {
    	return price;
    }
    
    public int getShares() {
    	return shares;
    }

    
    @Override
    public String toString() {
    	String text = "Name; " + compName + " number: " + shares + " price: " + price;
    	return text;
    }

}