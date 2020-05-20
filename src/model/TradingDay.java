package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import company.Company;
import company.CompanyBuilder;
import investor.*;

public class TradingDay {
	private File file;
	private Scanner scanner;
	InvestorCollectionInterface investors = getInvestors();
    Investor inv;
    
    InvestorIteratorInterface baseIterator = investors.iterator();
	public ArrayList<Company> companies = new ArrayList<Company>();	
	
	public TradingDay() {
		newData();
		startTrade();
	}
	
	
	private void startTrade() {
		
	}


	private void newData() {
		
		
		try {
		     file = new File("src/company/CompaniesName.txt");
		     scanner = new Scanner(file);
		      while (scanner.hasNextLine()) {
		        String name = scanner.nextLine();
		        Company com = new CompanyBuilder(name).setId(UUID.randomUUID().toString()).build();
		        companies.add(com);
				System.out.println(com);
		      }
		      scanner.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }	
		
		while (baseIterator.hasNext()) {
            inv = baseIterator.next();
            System.out.println(inv);
        }
		
	}
	
	private InvestorCollectionInterface getInvestors() {
        InvestorCollectionInterface investors = new InvestorCollection();
        try {
		     file = new File("src/investor/InvestorsName.txt");
		     scanner = new Scanner(file);
		      while (scanner.hasNextLine()) {
		        String name = scanner.nextLine();		
		        Investor inv = new InvestorBuilder(name).setInvestorId(UUID.randomUUID().toString()).build();
		        investors.addInvestor(inv);
				System.out.println(inv);
		      }
		      scanner.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }
        return investors;
    }  
	
	
}
