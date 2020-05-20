package company;

import java.util.ArrayList;
import java.util.List;

import investor.InvestorBuilder;

public class Company {
	 private String id;
	    private String compName;
	    private double price;
	    private int shares;
	    protected int sold;
    
	    protected Company(CompanyBuilder builder) {
	    	this.id = builder.id;
	    	this.compName = builder.compName;
	    	this.price = builder.price;
	    	this.shares = builder.shares;
	    	this.sold = 0;
	    }
	    
    public String getId() {
        return id;
    }

    public String getCompName() {
        return compName;
    }

    public double getPrice() {
    	return price;
    }
    
    public int getShares() {
    	return shares;
    }

    public int getSold() {
    	return sold;
    }
    public void setSold() {
    	this.shares--;
    	this.sold++;
    	if(sold == 10) {
    		price = price * 2.00;
    		sold = 0;
    		System.out.println("DOUBLED--"+ compName + "--DOUBLED");
    	}
	}
    
    @Override
    public String toString() {
    	String text = "Company: " + compName + " Number: " + shares + " Price: " + price;
    	return text;
    }

	public void setPrice(double price) {
		this.price = price;
	}

	

}
