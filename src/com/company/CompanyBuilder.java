package com.company;

public class CompanyBuilder {

    private final long id;
    private String compName;

    public CompanyBuilder(long id) {
        this.id = id;
        this.compName = compName;
    }

    public long getId() {
        return id;
    }

    public String getCompName() {
        return compName;
    }

    public String setCompName(String compName) {
        this.compName = compName;
        return compName;
    }
}
