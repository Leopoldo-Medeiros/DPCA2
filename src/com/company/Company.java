package com.company;

import Investor.InvestorBuilder;

import java.util.ArrayList;
import java.util.List;

public class Company<StockMarket> extends InvestorBuilder {
    private final long id;
    private String compName;

    public Company(long id){
        this.id = id;
    }

    public Company(long id, String compName){

        this.id = id;
        this.compName = compName;
    }
        List<Company> company = new ArrayList<Company>();

    public long getId() {
        return id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void showStockMarketDetails() {
        System.out.println(getCompName().getClass());
    }


}
