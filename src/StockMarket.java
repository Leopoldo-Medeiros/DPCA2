import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import investor.*;
import company.*;

public class StockMarket {
    
	public static void main(String[] args) {
		
		    Investor inv = new InvestorBuilder("Leo").setInvestorId("03234").build();
			System.out.println(inv);
			Company com = new CompanyBuilder("Apple").setId("94123").build();
			System.out.println(com);
	}
   

}


