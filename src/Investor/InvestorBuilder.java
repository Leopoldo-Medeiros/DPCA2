package Investor;

import java.util.IllegalFormatException;
import java.util.Random;

public class InvestorBuilder {

    Random rand = new Random();
    int low = 1000;
    int high = 10000;
    int result = rand.nextInt(high-low) + low;

    private int id = 0;
    private String InvestName;

    public InvestorBuilder() {
        this.id = id;
        String investName = null;
        InvestName = investName;
    }
}
