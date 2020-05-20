package company;

import java.util.Random;

public class CompanyBuilder {
	private Random rand = new Random();
    protected String id;
    protected String compName;
    protected int price;
    protected int shares;
    

    public CompanyBuilder(String compName) {
        this.compName = compName;
       
    }

    public CompanyBuilder setId(String id) {
         this.id = id;
         return this;
    }

    public Company build() {
        this.price = rand.nextInt(100-10) + 10;
        this.shares = rand.nextInt(1000-500) + 500;
        return new Company(this);
    }
}
