package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
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
    Random random;
    		
    InvestorIteratorInterface baseIterator = investors.iterator();
	public ArrayList<Company> companies = new ArrayList<Company>();	
	
	public TradingDay() {
		getCompanies();
		startTrade();
	}
	
	
	private void startTrade() {
		while (baseIterator.hasNext()) {
            inv = baseIterator.next();
            buyShare(inv);
        }	
	}

	public void buyShare(Investor inv) {
		random = new Random();
		int number = random.nextInt(100);
		Company com = companies.get(number);
		if(com.getShares() > 0) {
			if(inv.getBudget() > com.getPrice()) {
				inv.setBudget(inv.getBudget() - com.getPrice());
				System.out.println(inv +" ---> " +com);
			}
		}
		
	}

	private void getCompanies() {
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
		
		
	}
	
	
	
	
	//make investors and add to the collection
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
