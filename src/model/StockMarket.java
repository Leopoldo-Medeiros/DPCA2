package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import investor.*;
import company.*;

public class StockMarket {
	static File file;
	static Scanner scanner;
	
	
	public static void main(String[] args) {
		newData();
	}

	private static void newData() {
			try {
			     file = new File("src/investor/InvestorsName.txt");
			     scanner = new Scanner(file);
			      while (scanner.hasNextLine()) {
			        String name = scanner.nextLine();		
			        Investor inv = new InvestorBuilder(name).setInvestorId(UUID.randomUUID().toString()).build();
					System.out.println(inv);
			      }
			      scanner.close();
			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			    }
			
			try {
			     file = new File("src/company/CompaniesName.txt");
			     scanner = new Scanner(file);
			      while (scanner.hasNextLine()) {
			        String name = scanner.nextLine();
			        Company com = new CompanyBuilder(name).setId(UUID.randomUUID().toString()).build();
					System.out.println(com);
			      }
			      scanner.close();
			    } catch (FileNotFoundException e) {
			      e.printStackTrace();
			    }		
		}
	
   
	
	

}


