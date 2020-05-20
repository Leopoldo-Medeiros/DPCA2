package investor;

import java.util.ArrayList;
import java.util.List;

public class InvestorIterator implements InvestorIteratorInterface {

	ArrayList<Investor> investors;
	private int pos = 0;

	public InvestorIterator(List<Investor> investors) {
		this.investors = (ArrayList<Investor>) investors;
	}

	@Override
	public boolean hasNext() {
		Investor inv = null;
		while (pos < investors.size()) {
			inv = investors.get(pos);
			if (pos >= investors.size()) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public Investor next() {
		Investor investor = investors.get(pos);
		pos = pos + 1;
		return investor;
	}

}