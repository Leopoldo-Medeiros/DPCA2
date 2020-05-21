package model;

import java.util.ArrayList;

import company.Company;

public class FacadeReport {

	public static enum Type{
		COMPANY, INVESTOR;
	}
	public static enum Result{
		HIGH, LOW;
	}
	
	public static void generateReport(Type type, Result result, View view) {
		
		if(type == Type.COMPANY && result == Result.HIGH) {
			ArrayList<Company> high = new ArrayList<Company>();
			high.add(view.companies.get(0));
			for (int i = 0; i< view.companies.size(); i++) {
				double capital = view.companies.get(i).getPrice() * view.companies.get(i).getShares();
				double highestCapital = high.get(0).getPrice() * high.get(0).getShares();
				if (capital > highestCapital) {
					high.clear();
					high.add(view.companies.get(i));
				} else if (capital == highestCapital) {
					high.add(view.companies.get(i));
				}
			}
			System.out.println(high);
		}
	}
	
	
}
