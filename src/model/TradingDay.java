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
	private int fails = 0;
	private double cheapestShare = 100;
	private int totalTrades = 0;
	Investor inv;
	Random random;
	private Scanner scanner;
	InvestorCollectionInterface investors = getInvestors();
	InvestorIteratorInterface baseIterator = investors.iterator();
	public ArrayList<Company> companies = new ArrayList<Company>();

	public TradingDay() {
		getCompanies();
		startTrade();
		System.out.println("Number of trades: " + totalTrades );
	}

	private void startTrade() {
		while (fails < 100)
				if(baseIterator.hasNext()) {
				inv = baseIterator.next();
				buyShare(inv);
		}else {
			baseIterator.restart();
		}
	}

	public void buyShare(Investor inv) {
		random = new Random();
		int number = random.nextInt(100);
		Company com = companies.get(number);
		if (com.getShares() > 0) {
			if (inv.getBudget() >= cheapestShare) {
				if (inv.getBudget() > com.getPrice()) {
					inv.setBudget(inv.getBudget() - com.getPrice());
					com.setSold();
					checkCompanies();
					totalTrades++;
					System.out.println("TRADE BETWEEN " + inv + " --AND--> " + com);
				}
			} else {
				fails++;
			    System.out.println("FAILED--"+ inv.getInvestorName() + " --FAILED");
			}
		}
		cheapestShare();
	}

	private void checkCompanies() {
		if(totalTrades % 10 == 0) {
			for (int i = 0; i < companies.size(); i++) {
				Company com = companies.get(i);
				if (com.getSold() == 0) {
					double value = com.getPrice() - (com.getPrice() * 0.02);
					com.setPrice(value);
					System.out.println("REDUCED--"+ com.getCompName() + " --REDUCED");
				}
			}
		}
	}

	private void cheapestShare() {
		for (int i = 0; i < companies.size(); i++) {

			if (cheapestShare > companies.get(i).getPrice()) {
				System.out.println(cheapestShare);
				cheapestShare = companies.get(i).getPrice();
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

	// make investors and add to the collection
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
