import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import investor.*;

public class StockMarket {
    
	public static void main(String[] args) {
		
		        Investor inv = new InvestorBuilder("leo").setInvestorId("03234").build();
				System.out.println(inv);
		   
	}
   

}


