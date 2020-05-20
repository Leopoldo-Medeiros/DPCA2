package com.company;

import java.util.ArrayList;
import java.util.List;

import investor.InvestorBuilder;

public class Company {
    private final long id = 0;
    private String compName;

    
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
